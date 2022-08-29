package basicTestCases;

import com.fasterxml.jackson.databind.ObjectMapper;
import comApiBase.BaseClass;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.Authn;
import utility.CommonUtilFunctions;
import utility.CreateURL;
import utility.RestFWLogger;

import static io.restassured.RestAssured.given;

public class ReadRepressentationOnResource {
    Response response;
    String endPoint = CreateURL.getBaseURI("/user/repos/");
    String bearer_token = Authn.getBearerToken();
    ObjectMapper objectMapper;



}
