<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Oracle BI</title>
</head>
<body>
	<h3>Before testing the below examples, make sure the Oracle Virtual Machine is up and running, with port forwarding correctly configured like <a href="https://i.imgur.com/M0MF93a.jpg" target="_blank">here</a> (for VirtualBox).</h3>
	<h3>Download the Virtual Machine from <a href="https://www.oracle.com/middleware/technologies/obiee-samples-downloads.html" target="_blank">Oracle</a> (5 zip files 001 -> 005,requires a free Oracle account) or from <a href="https://ctipub-my.sharepoint.com/:f:/g/personal/alin_tirlea_stud_acs_upb_ro/Ej60a-zIPXlJpYy9igT0DB4BGM3eokmCsfZRg1xB4CySww" target="_blank">Onedrive</a> (2 zip files, download each one individually!).</h3>
	<h3>Start the BI server from the Virtual Machine like <a href="https://i.imgur.com/7jkfRWl.jpg" target="_blank">here</a></h3>
	<h3>Test your connection with the BI server from the Virtual machine <a href="http://localhost:7780/analytics/saw.dll?bieehome" target="_blank">here</a></h3>
	<br/><hr><br/>
	<p>
		Oracle BI VM Build_607 - New Visuals (Working both web services and Go Url):
	</p>
	<a href="pages/businessintreport.jsp?bireportname=New Visuals&birootpath=/shared/01. QuickStart/Simple Demo Dashboard/New Viz/&basewsdlurl=http://127.0.0.1:7780/analytics/saw.dll/wsdl/v12" target="_blank">Report with web services (secure)</a>
	<br/><br/>
	<a href="http://127.0.0.1:7780/analytics/saw.dll?PortalGo&Action=prompt&path=%2Fshared%2F01.%20QuickStart%2FSimple%20Demo%20Dashboard%2FNew%20Viz%2FNew%20Visuals" target="_blank">Direct link to report</a>
	<br/><br/>
	<a href="http://127.0.0.1:7780/analytics/saw.dll?Go&NQUser=prodney&NQPassword=Admin123&Path=/shared/01. QuickStart/Simple Demo Dashboard/New Viz/New Visuals&Action=Navigate&P0=1&P1=eq&P2=%22Ship%20To%20Main%20Info%22.%22Web%20Portal%20ID%22&P3=0&Options=fd&hideMainBar=true" target="_blank">Report using GO URL (not secure)</a>
	<br/><br/><br/><hr><br/>
	
	<p>
		Oracle BI VM Build_607 - D3_Flower (Not Working with web services):
	</p>
	<a href="pages/businessintreport.jsp?bireportname=D3_Flower&birootpath=/shared/02. Visualizations/Java Visuals/&basewsdlurl=http://127.0.0.1:7780/analytics/saw.dll/wsdl/v12" target="_blank">Report with web services (secure)</a>
	<br/><br/>
	<a href="http://127.0.0.1:7780/analytics/saw.dll?PortalGo&Action=prompt&path=%2Fshared%2F01.%20QuickStart%2FSimple%20Demo%20Dashboard%2FNew%20Viz%2FNew%20Visuals" target="_blank">Direct link to report</a>
	<br/><br/>
	<a href="http://127.0.0.1:7780/analytics/saw.dll?Go&NQUser=prodney&NQPassword=Admin123&Path=/shared/02. Visualizations/Java Visuals/D3_Flower&Action=Navigate&P0=1&P1=eq&P2=%22Ship%20To%20Main%20Info%22.%22Web%20Portal%20ID%22&P3=0&Options=fd&hideMainBar=true" target="_blank">Report using GO URL (not secure)</a>
	<br/><br/><br/><hr><br/>
</body>
</html>