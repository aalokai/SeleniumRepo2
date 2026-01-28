//Simple restassured test 
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test1 {
	@Test
	public void test_1() {
		String apikey="x-api-key";
		Response response=RestAssured
				.given()
				.header("Authorization","x-api-key reqres-free-v1").get("https://reqres.in/api/users?page=2");
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		
		int statusCode=response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}

}
