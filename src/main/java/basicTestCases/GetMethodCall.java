package basicTestCases;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetMethodCall {

    @Test
    public void getMethodCall(){
        RestAssured.baseURI = "https://github.com";
        String bearer_token = "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";

        given().queryParam("order", "398481").
                queryParam("Description", "AGRICULTURE FORESTRY AND FISHING").
                when().get("/repositories").
                then().statusCode(200).and().log().all().
                contentType(ContentType.HTML);
        System.out.println("Get method successful executed ");




    }
}
