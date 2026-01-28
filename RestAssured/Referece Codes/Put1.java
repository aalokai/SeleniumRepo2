import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

class Put1 {
	/*@Test
	public void putMethod() {
	RequestSpecification reqspec;
	String payload="{\r\n"
			+ "    \"name\": \"morpheus\",\r\n"
			+ "    \"job\": \"zion resident\"\r\n"
			+ "}";
	reqspec=RestAssured.given();
	reqspec.baseUri("https://reqres.in/");
	reqspec.basePath("api/users/2");
	reqspec.header("content-Type","application/json");
	reqspec.body(payload);
	reqspec.put()
	.then().assertThat().statusCode(200);//update
	}*/
	
	@Test
	public void test1()
	{
		String payload="{\r\n"
		        + "\"place_id\":\"91f6251be43994e7df2ba750c5072a80\",\r\n"
		        + "\"address\":\"70 winter walk, USA\",\r\n"
		        + "\"key\":\"qaclick123\"\r\n"
		        + "}";

		RestAssured.baseURI="https://rahulshettyacademy.com";
		given()
		    .queryParam("key", "qaclick123")
		    .header("Content-Type", "application/json")
		    .body(payload)
		.when()
		    .put("/maps/api/place/update/json")
		.then()
		    .log().all()
		    .assertThat().statusCode(200)
		    .assertThat().body("msg", equalTo("Address successfully updated"));
	}
}
