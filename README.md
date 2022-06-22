# Java_Maven_Tax_byCountryCode_calculator
Java Maven code that receives CC and gross, calculates TAX and provides net


Enviroment
-----------
Eclipse JEE 2022
JAVA SE 1.8
JUnit 4.11
Spring 5.3.21 (import libraries or use uploaded POM)
Compiler compliance level 17



Expansion
----------
Import Servlets or Integrate Tomcat as server
Creat Srvlets Classes and BO Class 
Creat HTML page to pass User input from HTML page to backend using HttpServlet

To Run
-------
1. Import project
2. Update Project via right-click on project>Maven>Update Project to eliminate any envir incompatibilities 
3. Run Maven>Clean 
4. Run Maven>Install to package, build and execute 

To Test
--------
1. From EntryDAOImplTest change values of Entries result=dao.read(STRING); in Test1 to test the right initialisation of user input
2. From EntryDAOImplTest change values of  if(result.getNetPrice().equals(<DOUBLE>)) to test the right calculation of Net
3. From EntryDAOImplTest change values of Entries result=dao.read(STRING); to test For loop for finding matching pair keys in the two storage Maps
