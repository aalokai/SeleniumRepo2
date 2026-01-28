import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class SchemaValidator {
	
	/*	@Test
	    public void getList()
	    {
		RestAssured.baseURI="https://reqres.in/";
		given().header("content-type","application/json").
		when().get("/api/users/2").
		then().log().all()
			.assertThat().body(matchesJsonSchemaInClasspath("Schema.json"));
		}*/
		@Test
		public void test1()
		{
			RestAssured.baseURI="https://api.restful-api.dev";

			given()
			    .header("content-type","application/json")
			.when()
			    .get("/objects/7")
			.then()
			    .log().all()
			    .assertThat()
			    .body(matchesJsonSchemaInClasspath("Schema1.json"));
		}

}
