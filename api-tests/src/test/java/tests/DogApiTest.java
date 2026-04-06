package tests;

import base.BaseApiTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class DogApiTest extends BaseApiTest {

    @Test
    void deveListarTodasAsRacas() {
        given()
            .when()
            .get("/breeds/list/all")
            .then()
            .statusCode(200)
            .body("message", notNullValue())
            .body("status", equalTo("success"));
    }

    @Test
    void deveRetornarImagensDaRaca() {
        given()
            .when()
            .get("/breed/hound/images")
            .then()
            .statusCode(200)
            .body("message", is(not(empty())))
            .body("message[0]", containsString("http"))
            .body("status", equalTo("success"));
    }

    @Test
    void deveRetornarImagemAleatoria() {
        given()
            .when()
            .get("/breeds/image/random")
            .then()
            .statusCode(200)
            .body("message", containsString("http"))
            .body("status", equalTo("success"));
    }
}