import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import org.junit.jupiter.api.Test;



public class HomeWork5 {

    @Test
    public void TestRestAssured(){
        JsonPath response = RestAssured
                .given()
                .get("https://playground.learnqa.ru/api/get_json_homework")
                .jsonPath();

        String name = response.get("messages[1]").toString();
        System.out.println(name);
    }
}