package com.itbootcamp.bgqa.nedelja7.api.petstore;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static io.restassured.path.json.JsonPath.with;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class RestAssuredHelloWorld {

    @Test
    public void simpleApiCallTest() {
        String requestBody = "{\n" +
                "    \"id\" : \"1\",\n" +
                "    \"name\" : \"kuca\",\n" +
                "    \"status\" : \"available\",\n" +
                "    \"photoUrls\" : [\"https://www.mydog.com/\", \"https://www.mydog2.com/\"],\n" +
                "    \"tags\" : [\n" +
                "        {\"id\" : \"1\", \"name\" : \"myTag1\"},\n" +
                "        {\"id\" : \"2\", \"name\" : \"myTag2\"}\n" +
                "    ]\n" +
                "}";
        RestAssured.baseURI = "https://petstore.swagger.io/v2/pet/";

        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post("/")
                .then()
                .extract().response();

        Assert.assertEquals(response.statusCode(), 200, "status code should be 200");
        Assert.assertEquals(response.jsonPath().getString("id"), "1", "id should be 1");
    }
}
