package testweather;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class apiTest {
	@Test
	public void getWeatherDetails() {
	
		RestAssured.baseURI ="http://api.openweathermap.org/data/2.5/"; 
		 RequestSpecification request = RestAssured.given();
		 
		 Response response = request.queryParam("q", "Bangalore") 
		                    .queryParam("appid", "7fe67bf08c80ded756e598d6f8fedaea") 
		                    .get("/weather");
		 
		 String jsonString = response.asString();
		 System.out.println(response.getStatusCode()); 
		 Assert.assertEquals(jsonString.contains("Bengaluru"), true);		 }
}
	