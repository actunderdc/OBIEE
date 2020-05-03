package com.abs.bi;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OBIEEBridge
 */
@SuppressWarnings("serial")
public class OracleBridgeServlet extends HttpServlet {
	public OracleBridgeServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			this.processRequest(request, response);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			this.processRequest(request, response);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpURLConnection urlCon = forwardRequest(request);
		forwardResponse(response, urlCon);
	}

	private String decodeURL(HttpServletRequest request) {
		StringBuilder bufURL = new StringBuilder("");
		Map<String, String[]> params = request.getParameterMap();
		String[] arrURL = params.get("RedirectURL");
		String strURL = arrURL == null || arrURL.length == 0 ? null : arrURL[0];
		bufURL.append(strURL);
		int nQIndex = strURL != null ? strURL.lastIndexOf('?') : -1;

		if (!params.isEmpty()) {
			bufURL.append(((nQIndex >= 0) ? "&" : "?"));
			Set<String> keys = params.keySet();
			Iterator<String> it = keys.iterator();
			while (it.hasNext()) {
				try {
					String strKey = it.next();
					if ("RedirectURL".equalsIgnoreCase(strKey)) {
						continue;
					}
					String strEncodedKey = URLEncoder.encode(strKey, "UTF-8");
					String[] paramValues = params.get(strKey);
					for (String paramValue : paramValues) {
						bufURL.append(strEncodedKey);
						bufURL.append("=");
						bufURL.append(URLEncoder.encode(paramValue, "UTF-8"));
						bufURL.append("&");
					}
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}
			bufURL.deleteCharAt(bufURL.length() - 1);
		}
		return bufURL.toString();
	}

	private HttpURLConnection forwardRequest(HttpServletRequest request) throws IOException {
		String strMethod = request.getMethod();
		boolean isPostReq = "POST".equalsIgnoreCase(strMethod);
		String strURL = decodeURL(request);
		String baseURL = strURL;
		String[] arrURL = strURL.split("&", 2);
		if (isPostReq) {
			baseURL = arrURL[0];
		}
		URL url = new URL(baseURL);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();

		con.setRequestMethod(strMethod);
		Enumeration<String> en = request.getHeaderNames();
		String strHeader;
		while (en.hasMoreElements()) {
			strHeader = en.nextElement();
			String strHeaderValue = request.getHeader(strHeader);
			con.setRequestProperty(strHeader, strHeaderValue);
		}

		if (isPostReq) {
			con.setDoOutput(true);
			con.setDoInput(true);
			con.setUseCaches(false);
			DataOutputStream forwardStream = new DataOutputStream(con.getOutputStream());
			try {
				String urlParameters = arrURL[1];
				forwardStream.writeBytes(urlParameters);
				forwardStream.flush();
			} finally {
				forwardStream.close();
			}
		}
		return con;
	}

	private void forwardResponse(HttpServletResponse response, HttpURLConnection con) throws IOException {
		int i = 0;
		try {
			response.setStatus(con.getResponseCode());
			while (con.getHeaderFieldKey(++i) != null) {
				String strKey = con.getHeaderFieldKey(i);
				String strValue = con.getHeaderField(i);
				if ("Set-Cookie".equalsIgnoreCase(strKey)) {
					String[] cookieStr1 = strValue.split(";");
					String[] cookieStr2 = cookieStr1[0].split("=");
					if (cookieStr2.length > 1) {
						Cookie c = new Cookie(cookieStr2[0], cookieStr2[1]);
						c.setHttpOnly(true);
						c.setPath("/");
						response.addCookie(c);
					}
				} else {
					response.setHeader(strKey, strValue);
				}
			}
			copyStreams(con.getInputStream(), response.getOutputStream());
		} finally {
			response.getOutputStream().close();
			con.getInputStream().close();
		}
	}

	private void copyStreams(InputStream inputStream, OutputStream forwardStream) throws IOException {
		byte[] buffer = new byte[1024 * 128];
		int k = 0;
		while ((k = inputStream.read(buffer)) != -1) {
			forwardStream.write(buffer, 0, k);
		}
	}

}