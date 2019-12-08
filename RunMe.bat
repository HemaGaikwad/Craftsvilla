set projectLocation=C:\Edureka_Nov19\Craftsvilla
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\Libraries\*
java org.testng.TestNG %projectLocation%\testng.xml
pause