package com.abs.bi;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspWriter;

import oracle.bi.web.soap.AuthResult;
import oracle.bi.web.soap.HtmlViewService;
import oracle.bi.web.soap.HtmlViewServiceSoap;
import oracle.bi.web.soap.ReportHTMLLinksMode;
import oracle.bi.web.soap.ReportHTMLOptions;
import oracle.bi.web.soap.ReportRef;
import oracle.bi.web.soap.SAWLocale;
import oracle.bi.web.soap.SAWSessionParameters;
import oracle.bi.web.soap.SAWSessionService;
import oracle.bi.web.soap.SAWSessionServiceSoap;
import oracle.bi.web.soap.StartPageParams;

public class OracleBIUtils {

	private OracleBIUtils() {
	}

	/** Called from businessinetreport.jsp */
	public static void writeBiContent(HttpServletRequest request, JspWriter out) throws IOException {
		String reportHtml = getReportAsHTML(request);
		if (out != null) {
			out.println(reportHtml);
		}
	}

	public static String getReportAsHTML(HttpServletRequest request) throws MalformedURLException {
		String userAgent = request.getHeader("User-Agent");
		Locale userLocale = request.getLocale();
		String bridgeServletContextPath = request.getContextPath() + "/oraclebridgeservlet";
		String biReport = request.getParameter("bireportname");
		String biRootPath = request.getParameter("birootpath");
		URL wsdlURL = new URL(request.getParameter("basewsdlurl"));
		String biUserName = "prodney";
		String biPassword = "Admin123";
		HtmlViewService htmlViewService;
		try {
			htmlViewService = new HtmlViewService(wsdlURL);
		} catch (Exception ex) {
			return "ERROR: " + ex.getMessage();
		}
		HtmlViewServiceSoap htmlClient = htmlViewService.getHtmlViewService();
		SAWSessionService sAWSessionService = new SAWSessionService(wsdlURL);
		SAWSessionServiceSoap myPort = sAWSessionService.getSAWSessionServiceSoap();
		SAWSessionParameters sessionparams = new SAWSessionParameters();
		sessionparams.setUserAgent(userAgent);
		SAWLocale sawlocale = new SAWLocale();
		sawlocale.setLanguage(userLocale.getLanguage());
		sawlocale.setCountry(userLocale.getCountry());
		sessionparams.setLocale(sawlocale);
		sessionparams.setAsyncLogon(false);
		AuthResult result;
		try {
			result = myPort.logonex(biUserName, biPassword, sessionparams);
		} catch (Exception ex) {
			return "Oracle Bi Authentication failed!";
		}
		String sessionID = result.getSessionID();
		List<String> keepAliveSessionList = new ArrayList<>(1);
		keepAliveSessionList.add(sessionID);
		myPort.keepAlive(keepAliveSessionList);
		StartPageParams spparams = new StartPageParams();
		spparams.setDontUseHttpCookies(true);
		return determineHTML(bridgeServletContextPath, biReport, biRootPath, htmlClient, sessionID, spparams);
	}

	private static String determineHTML(String bridgeServletContextPath, String biReport, String biRootPath, HtmlViewServiceSoap htmlClient, String sessionID, StartPageParams spparams) {
		String pageID = htmlClient.startPage(spparams, sessionID);

		/**
		 * This method will set the path to the servlet which will act like a bridge to
		 * retrieve all the OBIEE resources like the javascript, CSS and the report.
		 */
		htmlClient.setBridge(bridgeServletContextPath, sessionID);
		ReportHTMLOptions htmlOptions = new ReportHTMLOptions();
		htmlOptions.setEnableDelayLoading(false);
		htmlOptions.setLinkMode(ReportHTMLLinksMode.IN_PLACE.value());
		ReportRef reportref = new ReportRef();
		reportref.setReportPath(biRootPath + biReport);
		StartPageParams startpageparams = new StartPageParams();
		startpageparams.setDontUseHttpCookies(false);
		biReport = biReport.replaceAll("[^A-Za-z0-9]", "");
		try {
			htmlClient.addReportToPage(pageID, biReport, reportref, null, null, htmlOptions, sessionID);
		} catch (Exception ex) {
			return "ERROR in retrieving BI report: " + ex.getMessage();
		}
		String reportHtml = htmlClient.getHeadersHtml(pageID, sessionID);
		reportHtml = reportHtml + htmlClient.getHtmlForReport(pageID, biReport, sessionID);
		reportHtml = reportHtml + htmlClient.getCommonBodyHtml(pageID, sessionID);

		htmlClient.getCommonBodyHtml(pageID, sessionID);
		return reportHtml;
	}

}
