import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Delete1 {

	/*@Test
	public void deleteMethodcall() {
		RequestSpecification reqspec;
		reqspec=RestAssured.given();
		reqspec.baseUri("https://reqres.in/");
		reqspec.basePath("api/users/3");
		reqspec.header("content-Type","application/json");
		
		reqspec.delete()
		.then()
		.assertThat().statusLine("HTTP/1.1 204 No Content");//delete
	}*/
	
	@Test
	public void test1()
	{
		String payload = "{\r\n"
				+ " \"place_id\": \"6c6d83443bfe3232daed001c2630834c\"\r\n"
				+ "}";
		RestAssured.baseURI="https://rahulshettyacademy.com";
		given()
		.queryParam("key", "qaclick123")
		.when()
	    .delete("/maps/api/place/delete/json")
	    .then()
	    .log().all()
	    .assertThat().statusLine("HTTP/1.1 200 OK");
	
	}	
}
