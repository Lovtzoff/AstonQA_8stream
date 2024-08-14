package ru.aston;

import io.restassured.RestAssured;
import io.restassured.specification.ResponseSpecification;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static org.hamcrest.Matchers.equalTo;
import static ru.aston.Constants.BASE_URL;

public class BaseTest {

    protected static ResponseSpecification responseSpec;

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = BASE_URL;

        responseSpec = RestAssured.expect()
                .statusCode(HttpStatus.SC_OK)
                .and().body("headers.host", equalTo("postman-echo.com"))
                .and().body("headers.x-forwarded-proto", equalTo("http"))
                .and().body("headers.connection", equalTo("close"))
                .and().body("headers.x-forwarded-port", equalTo("443"))
                .and().body("headers.accept", equalTo("*/*"))
                .and().body("headers.user-agent", equalTo("Apache-HttpClient/4.5.13 (Java/11.0.24)"))
                .and().body("headers.accept-encoding", equalTo("gzip,deflate"));
    }

    @AfterAll
    public static void tearDown() {
        RestAssured.reset();
        responseSpec = null;
    }
}

