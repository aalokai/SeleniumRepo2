import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

class Get1 {
	/*@Test
	public void getSingle()
	{
		//Create a request specification
		RequestSpecification request=RestAssured.given();
		//Adding endpoint URL
		request.baseUri("https://petstore3.swagger.io/api/v3/pet/10");
		//Call get method
		Response response=request.get();
		//Print response body
		String resString=response.asString();
		System.out.println(resString);
		//Perform validation on the response
		ValidatableResponse valres=response.then();
		valres.statusCode(200);
	}*/
	/*@Test
	public void test1()
	{//https://rahulshettyacademy.com/maps/api/place/get/json?key=qaclick123&place_id=e8c102351efbe00ff7f568d8c56eeff8
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		given()
		    .header("Content-Type", "application/json")
		    .queryParam("key", "qaclick123")
		    .queryParam("place_id", "e8c102351efbe00ff7f568d8c56eeff8")
		.when()
		    .get("/maps/api/place/get/json")
		.then()
		    .log().all();
	}*/
	@Test
    public void test2()
    {
	RestAssured.baseURI = "https://rahulshettyacademy.com";
	given()
	    .header("Content-Type", "application/json")
	    .queryParam("key", "qaclick123")
	    .queryParam("place_id", "e8c102351efbe00ff7f568d8c56eeff8")
	.when()
	    .get("/maps/api/place/get/json")
	.then()
	    .log().all()
	                  .assertThat().statusCode(200)
	                  .assertThat().time(lessThan(5000L))
	                  .assertThat().header("content-type", "application/json;charset=UTF-8")
                                   .header("connection", "Keep-Alive")
                      .assertThat().body("name", equalTo("Fontline house"));
    }
}
