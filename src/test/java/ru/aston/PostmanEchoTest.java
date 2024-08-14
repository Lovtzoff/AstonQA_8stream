package ru.aston;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static ru.aston.Constants.*;

public class PostmanEchoTest extends BaseTest {

    @Test
    public void testGetRequest() {
        given().param(FOO1, BAR1)
                .param(FOO2, BAR2)
                .when()
                .get("/get")
                .then().log().body()
                .spec(responseSpec)
                .and().body("args." + FOO1, equalTo(BAR1))
                .and().body("args." + FOO2, equalTo(BAR2))
                .and().body("url", equalTo("http://postman-echo.com/get?foo1=bar1&foo2=bar2"));
    }

    @Test
    public void testPostRawText() {
        String requestBody = "{\n    \"test\": \"value\"\n}";

        given().log().body()
                .contentType("text/plain; charset=UTF-8").body(requestBody)
                .when()
                .post("/post")
                .then().log().body()
                .spec(responseSpec)
                .and().body("data", equalTo(requestBody))
                .and().body("headers.content-length", equalTo("23"))
                .and().body("headers.content-type", equalTo("text/plain; charset=UTF-8"))
                .and().body("json", equalTo(null))
                .and().body("url", equalTo("http://postman-echo.com/post"));
    }

    @Test
    public void testPostFormData() {
        given().contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .formParam(FOO1, BAR1)
                .formParam(FOO2, BAR2)
                .when()
                .post("/post")
                .then().log().body()
                .spec(responseSpec)
                .and().body("form." + FOO1, equalTo(BAR1))
                .and().body("form." + FOO2, equalTo(BAR2))
                .and().body("headers.content-length", equalTo("19"))
                .and().body("headers.content-type", equalTo("application/x-www-form-urlencoded; charset=UTF-8"))
                .and().body("json." + FOO1, equalTo(BAR1))
                .and().body("json." + FOO2, equalTo(BAR2))
                .and().body("url", equalTo("http://postman-echo.com/post"));
    }

    @Test
    public void testPutRequest() {
        given().log().body()
                .contentType("text/plain; charset=UTF-8").body(REQUEST_BODY)
                .when()
                .put("/put")
                .then().log().body()
                .spec(responseSpec)
                .and().body("data", equalTo(REQUEST_BODY))
                .and().body("headers.content-length", equalTo("58"))
                .and().body("headers.content-type", equalTo("text/plain; charset=UTF-8"))
                .and().body("json", equalTo(null))
                .and().body("url", equalTo("http://postman-echo.com/put"));
    }

    @Test
    public void testPatchRequest() {
        given().log().body()
                .contentType("text/plain; charset=UTF-8").body(REQUEST_BODY)
                .when()
                .patch("/patch")
                .then().log().body()
                .spec(responseSpec)
                .and().body("data", equalTo(REQUEST_BODY))
                .and().body("headers.content-length", equalTo("58"))
                .and().body("headers.content-type", equalTo("text/plain; charset=UTF-8"))
                .and().body("json", equalTo(null))
                .and().body("url", equalTo("http://postman-echo.com/patch"));
    }

    @Test
    public void testDeleteRequest() {
        given().log().body()
                .contentType("text/plain; charset=UTF-8").body(REQUEST_BODY)
                .when()
                .delete("/delete")
                .then().log().body()
                .spec(responseSpec)
                .and().body("data", equalTo(REQUEST_BODY))
                .and().body("headers.content-length", equalTo("58"))
                .and().body("headers.content-type", equalTo("text/plain; charset=UTF-8"))
                .and().body("json", equalTo(null))
                .and().body("url", equalTo("http://postman-echo.com/delete"));
    }
}

