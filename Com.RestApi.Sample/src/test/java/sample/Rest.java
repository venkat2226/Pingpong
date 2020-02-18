package sample;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

public class Rest {
	@Test
	public void test() {
		RestAssured.baseURI="https://www.google.com/search";
		Response res=(Response) given().queryParam("q=", "bookmyshow").param("rlz=", "1C1GCEU_en-GBIN830IN830").header("Content-Type", "application/json").when().get().then().assertThat().statusCode(200).extract();
		String x=res.asString();
		System.out.println(x);
		JsonPath s=new JsonPath(x);
		System.out.println(s);
	}
	//https://djvenky342@dev.azure.com/djvenky342/djvenky342/_git/djvenky342 
}
