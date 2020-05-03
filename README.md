# What is this project?
This is a project that embeds an analysis from Oracle Business Intelligence (OBIEE) into a Java application using web services (HTMLViewService).
This is an almost working example (for most analysis works, but for some it doesn't work). However, it's the result of my work after many hours of trying and searching online how to implement this.
It is very difficult (impossible maybe?) to find online a fully working example of how to embed an analysis in a 3rd party app.
Any contribution to this project would be highly appreciated!

## WHY?
The current implementation I was using to embed an Oracle BI Analysis into a Java application was based on Oracle's GO URL. However, this has a major security problem as the username/password are visible in the URL, as they are part of the GET request. In this implementation, the client (browser) directly accesses the BI Server to get the analysis. For this, it needs credentials.

## HOW?
The idea is to migrate to Oracle Business Intelligence Web Services using HTMLViewService. The WebServer (Tomcat) accesses the BI Server (so the credentials are never sent to the client) and the response (analysis) is forwarded to the client/browser. This is the purpose of the Bridge Servlet.

## Requirements (or tools used to create this project):
* Java 1.8 (I used Java 1.8.0_131x64)
* Tomcat (I used version 9.0.34)
* Eclipse with Maven (I used version 20.03 of Eclipse)
* A BI server (I used the Virtual Machine from Oracle)

## How to set up your own BI Server:
1. Download the virtual machine from Oracle's website (requires a free oracle account):
https://www.oracle.com/middleware/technologies/obiee-samples-downloads.html (there are 5 zip files .zip.001 -> .zip.005)

<details>
  <summary>Click to see image</summary>
  
  ![OBIEE Samples](https://i.imgur.com/BlG5chJ.jpg)
</details>

2. Extract the files to get a single .ova file (about 25GB in size).
3. Use VirtualBox (or Vmware): File -> Import Appliance -> next next etc.
4. Change the networking settings of the virtual machine. Make sure NAT is selected, and in Advanced -> Port Forwarding both Host IP and Guest IP are left empty.
<details>
  <summary>Click to see image</summary>
  
  ![Port Forwarding](https://i.imgur.com/M0MF93a.jpg)
</details>

If everything is set up correctly, any request received by your host machine on port 7780 will be forwared to the virtual machine where the BI server is.

5. Start the Virtual Machine. Click on Start -> Start DB & BI. This process will take some good minutes, please be patient until you receive a message telling you that all services are started and that you should not close the terminal window.
<details>
  <summary>Click to see image</summary>
  
  ![Start DB & BI](https://i.imgur.com/7jkfRWl.jpg)
</details>

6. Test the connection with the BI server from the host machine by accessing
http://localhost:7780/analytics/saw.dll?bieehome
(If it's not working, try the same url from the virtual machine using the Firefox browser that is pinned in the taskbar. You have a bookmark there named OBIEE login. In this way you can debug if it's a problem with the BI server or with the port forwarding)

## Deploying the application
* If using Eclipse chose File -> Import -> Existing Projects into Workspace -> OracleBI
* Make sure you have a server defined. Right click on the project -> Run as -> Run on server
* Access page http://localhost:8080/OracleBI/ and follow the instructions from there. **Always use incognito to avoid caching resources from the BI server!**

## Useful info:
All classes from \src\oracle\bi\web\soap have been generated using wsimport tool (from java) with the following command:
```
wsimport -keep  http://127.0.0.1:9502/analytics/saw.dll/wsdl/v12
```

## Problems encountered:
* Some resources(css, js, png) are not loaded properly. Errors appear in the browser console. Not all resources are loaded via the bridge servlet.
<details>
  <summary>Click to see D3_Flower analysis image (not loading, errors in console) </summary>
  
  ![D3_Flower](https://i.imgur.com/pN3Pfev.jpg)
</details>

* The export of the analysis is not fully working. Although the content in the file is correct, the file does not get the proper name, the message that the export is completed does not appear and some errors appear in the web console.
<details>
  <summary>Click to see New Visuals analysis image (loading, but errors in console when exporting) </summary>
  
  ![D3_Flower](https://i.imgur.com/LhmM0mq.jpg)
</details>

* To make the css work and surpress some warnings in the console, 2 css files and 3 png files were manually added in the WebContent folder. (**This is an ugly workaround!**)
* Most probably, the implementation of the bridge servlet done in class **OracleBridgeServlet.java** is not 100% correct.

## See more information on the stackoverflow issue opened below:
https://stackoverflow.com/questions/61390124/css-not-properly-loaded-on-oracle-bi-web-service

## External links with information:
Oracle's very poor documentation: https://docs.oracle.com/middleware/12212/biee/BIEIT/methods.htm#BIEIT181





