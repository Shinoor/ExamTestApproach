package utility;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class RestFWLogger {
    private static Logger Log = Logger.getLogger(RestFWLogger.class.getName());

    public static  void initLogger(){
        PropertyConfigurator.configure("log4j.properties");

    }

    // This is to print log for beginning of the test case
    public static void startTestCase(String sTestCaseName){

        Log.info("****************************************************************************");
        Log.info("****************************************************************************");
        Log.info("$$$$$$$$$$$$$$$      " +sTestCaseName + "      $$$$$$$$$$$$$$$$$$$$$$$$");
        Log.info("****************************************************************************");
        Log.info("****************************************************************************");
    }
    public  static void endTestCase(){
        Log.info("XXXXXXXXXXXXXXXXXXXX " + "-- E---N---D--"  + "          XXXXXXXXXXXXXXXXXXXX");
        Log.info("XXXXXXXXXXXXXXXXXXXX************************************XXXXXXXXXXXXXXXXXXXX");
        Log.info("XXXXXXXXXXXXXXXXXXXX************************************XXXXXXXXXXXXXXXXXXXX");
        Log.info("XX");
        Log.info("XX");
        Log.info("XX");
        Log.info("XX");
        Log.info("XX");
    }
    // Need to create these methods, so that they can be called
    public static void info(String message){
        Log.info(message);
    }
    public static void warn(String message){
        Log.warn(message);
    }
    public static void fatal(String message){
        Log.error(message);
    }
    public static void debug(String message){
        Log.debug(message);
    }
}
