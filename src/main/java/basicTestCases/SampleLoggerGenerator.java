package basicTestCases;


import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;
import utility.RestFWLogger;

public class SampleLoggerGenerator {
    @Test
    public void Rest_Test01(){
        PropertyConfigurator.configure("log4j.properties");
        RestFWLogger.startTestCase("Rest_Test01");
        RestFWLogger.info("Creating Rest Assured Object");
        RestFWLogger.info("Excel sheet opened");
        RestFWLogger.info("New Object instantiated");
        RestFWLogger.info("Implicit wait applied on the Test for 10 second");
        RestFWLogger.info("URI of the application launched");
        RestFWLogger.info("Login Successfully, now it is the time to log off buddy");
        RestFWLogger.info("Action is performed on the Log out link");
        RestFWLogger.info("Test Case Closed");
        RestFWLogger.endTestCase();

    }
    @Test
    public void Rest_Test02(){

        PropertyConfigurator.configure("log4j.properties");
        RestFWLogger.startTestCase("Rest_Test02");
        RestFWLogger.info("Creating Rest Assured Object");
        RestFWLogger.info("Excel sheet opened");
        RestFWLogger.info("New Object instantiated");
        RestFWLogger.info("Implicit wait applied on the Test for 10 second");
        RestFWLogger.info("URI of the application launched");
        RestFWLogger.endTestCase();
    }



}
