package utility;

public class CreateURL {
    public final static String baseURI = "https://api.github.com";



    public static String getBaseURI(String resourcePath){

        return baseURI + resourcePath;
    }

}
