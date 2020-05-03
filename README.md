#What is this project?
This is a project that embeds an analysis from Oracle Business Intelligence (OBIEE) into a Java application using web services.
This is an almost working example (for most analysis works, but for some it doesn't work). However, it's the result of my work after many hours of trying and searching online how to implement this.
It is very difficult (impossible maybe?) to find online a fully working example of how to embed an analysis in a 3rd party app.
Any contribution to this project would be highly appreciated!

##Requirements (or tools used to create this project):
Java 1.8
Tomcat 9.0.34
Eclipse with Maven
A BI server (you can use the Virtual Machine from Oracle)

##How to set up your own BI Server:
Download the virtual machine from Oracle's website (requires a free oracle account):
https://www.oracle.com/middleware/technologies/obiee-samples-downloads.html (there are 5 zip files .zip.001 -> .zip.005)
After that, extract the files to get a single .ova file (about 25GB in size).
Use VirtualBox (or Vmware): File -> Import Appliance -> next next etc.
Change the networking settings of the virtual machine. Make sure NAT is selected, and in Port Forwarding both Host IP and Guest IP are left empty, like here:
https://i.imgur.com/M0MF93a.jpg

##Useful info:
All classes from \src\oracle\bi\web\soap have been generated using wsimport tool (from java) with the following command:
wsimport -keep  http://127.0.0.1:9502/analytics/saw.dll/wsdl/v12

##Problem(s) encountered:
Some resources(css, js, png) are not loaded properly. Errors appear in the browser console. Not all resources are loaded via the bridge servlet.
To make the css work and surpress some warnings in the console, 2 css files and 3 png files were manually added in the WebContent folder.
Most probably, the implementation of the bridge servlet done in class OracleBridgeServlet.java is not 100% correct.

##See more information on the stackoverflow issue opened below:
https://stackoverflow.com/questions/61390124/css-not-properly-loaded-on-oracle-bi-web-service

##External links with information:
Oracle's very poor documentation: https://docs.oracle.com/middleware/12212/biee/BIEIT/methods.htm#BIEIT180





