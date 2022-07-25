import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Basics {
    public static void main(String[] args) {

        //Given - All input details
        //When - Submit the API - Resource & HTTP method
        //Then - validate the response
        RestAssured.baseURI="https://rahulshettyacademy.com";
        // When the Raw request is given
       /* given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").body("{\n" +
                "    \"location\":{\n" +
                "        \"lat\":-38.383494,\n" +
                "        \"lng\":33.427362\n" +
                "    },\n" +
                "    \"accuracy\":50,\n" +
                "    \"name\":\"Test\",\n" +
                "    \"phone_number\":\"(+91) 912 345 6789\",\n" +
                "    \"address\":\" Temp\",\n" +
                "    \"types\":[\n" +
                "        \"shoe park\",\n" +
                "        \"shop\"\n" +
                "    ],\n" +
                "    \"website\":\"https://temp.com\",\n" +
                "    \"language\":\"English\"\n" +
                "}").when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200) //status code check
                .body("scope",equalTo("APP")) //Body value check
                .header("Server","Apache/2.4.41 (Ubuntu)");*/

        // When the request passed through Payload class
        String response=given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").body(Payload.addPlacePayload()).when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200) //status code check
                .body("scope",equalTo("APP")) //Body value check
                .header("Server","Apache/2.4.41 (Ubuntu)").extract().response().asString();

        System.out.println("************");
        System.out.println(response);
        //Add place -> Update Place with new Address -> Get Place to validate if new address is present in response
    }

}
