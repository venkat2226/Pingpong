package sample;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Sample1 {

	@Test

	/*
	 * public void res() { // RestAssured.baseURI="";
	 * 
	 * RestAssured.baseURI = "http://localhost:8080"; Response res =
	 * given().header("Content-Type", "application/json").header("Cookie",
	 * "JSESSIONID=")
	 * .body("{ \"body\": \"Inserting comment from the automation code\"," +
	 * "\"visibility\": {" + "\"type\": \"role\"," +
	 * "\"value\": \"Administrators\" }" + "}")
	 * .when().post("/rest/api/2/issue/10207/comment/").then().statusCode(201).
	 * extract().response(); String x = res.asString(); JsonPath js = new
	 * JsonPath(x); String id = js.get("id"); System.out.println(id);
	 * 
	 * }
	 */
	public void get() {
		RestAssured.baseURI = "http://www.qaclickacademy.com/#/index";
		given().header("Content-Type", "application/json").get().then().assertThat().statusCode(200);
	}

}
