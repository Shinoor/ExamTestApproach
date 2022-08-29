package basicTestCases;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import comApiBase.BaseClass;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;
import resource.PojoClass;
import utility.*;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class PostCallMethod {
    Response response;
    String endPoint = CreateURL.getBaseURI("/user/repos/");
    String bearer_token = Authn.getBearerToken();
    ObjectMapper objectMapper;


    @Test
    public void createRepoTestCase() throws JsonProcessingException {
        PropertyConfigurator.configure("log4j.properties");
        RestFWLogger.startTestCase("CreateRepositoryTestCase");
        RestFWLogger.info("Starting Create Repo Test via POJO");
        RestFWLogger.info("Request URI is:- " + endPoint);

        PojoClass requestPayload = new PojoClass();
        requestPayload.setName("name");
        requestPayload.setDescription("Agriculture Forestry And Fishing");
        requestPayload.setOrderNumber("398481");
        requestPayload.setLevel("A");
        requestPayload.setCode("");
        requestPayload.setDescription("Agriculture-Forestry-And-Fishing");
        requestPayload.setItemIncludes("This section includes the exploitation of vegetable and animal nature resources comprising the activities of greying of crops");
        requestPayload.setReferenceToIsicRev4("A");

        objectMapper = new ObjectMapper();
        String payload = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(
                requestPayload);
        RestFWLogger.info("Request Payload :- " + payload);

        response = BaseClass.postRequest(endPoint, payload,bearer_token);
        String responseString = response.getBody().asString();
        RestFWLogger.info("Request Response :- " + responseString);

        Assert.assertEquals(requestPayload.getLevel(),
                CommonUtilFunctions.getResposeKeyValue(responseString,"Level"));
        RestFWLogger.info("Assertion on RepoPOJO is Done");
        RestFWLogger.info("Request Level:- " + requestPayload.getName());
        RestFWLogger.info("Response Level:- " + CommonUtilFunctions.getResposeKeyValue(
                responseString,"level"));

        Assert.assertEquals(requestPayload.getDescription(),
                CommonUtilFunctions.getResposeKeyValue(responseString,"description"));
        RestFWLogger.info("Assertion on RepoPOJO Descriptions is Done");
        RestFWLogger.info("Request Descriptions:- " + requestPayload.getDescription());
        RestFWLogger.info("Response Descriptions:- " + CommonUtilFunctions.getResposeKeyValue(
                responseString,"Agriculture Forestry And Fishing"));

        RestFWLogger.endTestCase();


}
}
