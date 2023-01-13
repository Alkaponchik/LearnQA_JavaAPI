import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class HomeWork6 {
    @Test
    public void HomeWork6(){

        Response response = RestAssured
                .given()
                .redirects()
                .follow(false)
                .when()
                .get("https://playground.learnqa.ru/api/long_redirect")
                .andReturn();
        response.prettyPrint();

        String test = response.getHeader("Location");
        System.out.println("Доступен переход на "+test);



    }
}