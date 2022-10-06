package com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.api.test;

import com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.api.model.ContentTypeFilter;
import com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.api.model.User;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ShoppingPageTest {

    private static final Path path = Paths.get("src/com/itbootcamp/bgqa/nedelja7/automation/ui/shopping/api/resources/");

    @BeforeMethod
    public void setBaseUri() {
        RestAssured.baseURI = "https://automationexercise.com/api/";
    }

    @Test
    public void testGetAllProductsList() {

        JsonPath expectedJson = new JsonPath(new File(getRelativeUri("product-list-expected.json")));

        given()
                .filter(new ContentTypeFilter()) //workaround since API returns text/html
                .get("productsList") //vraca stvarni rezultat
                .then()
                .log().body() //ovde se loguje stvarni rezultat
                .body("", equalTo(expectedJson.getJsonObject(""))) //proveravamo da li je stvarni=ocekivani
                .assertThat().statusCode(200); //proveravamo status kod
    }

    @Test
    public void postToAllProductList() {

        int responseCode = given()
                .when()
                .post("productsList")
                .then()
                .extract().jsonPath().getInt("responseCode");

        Assert.assertEquals(responseCode, 405, "The response code should be 405");
    }

    @Test
    public void testGetAllBrands() {

        JsonPath expectedJson = new JsonPath(new File(getRelativeUri("brands-list-expected.json")));

        given()
                .filter(new ContentTypeFilter()) //workaround
                .get("brandsList")
                .then()
                .log().body()
                .body("", equalTo(expectedJson.getJsonObject("")))
                .assertThat().statusCode(200);
    }

    @Test
    public void putToAllBrandsList() {

        int responseCode = given()
                .when()
                .put("brandsList")
                .then()
                .extract().jsonPath().getInt("responseCode");

        Assert.assertEquals(responseCode, 405, "The response code should be 405");
    }

    @Test
    public void postToSearchProducts() {
        //Response is not valid, report a bug
        given()
                .filter(new ContentTypeFilter())
                .queryParam("search_product", "jeans")
                .when()
                .post("searchProduct")
                .then()
                .assertThat().statusCode(200);

    }

    @Test
    public void postToCreateUserAccount() {

        User user = User.builder().email("email@email.com").name("tester1").password("123").build();
        /*
        ===== moze i ovako =====
        User user1 = new User();
        user.setEmail("email@email.com");
        user.setName("tester1");
        user.setPassword("123");
         */

        given()
                .body(user)
                .contentType(ContentType.JSON)
                .log().body() // log post data
                .post("createAccount")
                .then()
                .log().body() // log response, note that actual response is invalid, report bug
                .assertThat().statusCode(200);

    }


    private URI getRelativeUri(String fileName) {
        return path.resolve(fileName).toAbsolutePath().toUri();
    }
}
