import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class Post1 {
/*	@Test
	  public void postMethod() {
		  String payload="{\"id\": 50,"
		  		+ "            \"email\": \"kiruba.karan@reqres.in\","
		  		+ "            \"first_name\": \"kiruba\","
		  		+ "            \"last_name\": \"karan\","
		  		+ "            \"avatar\": \"https://reqres.in/img/faces/8-image.jpg\""
		  		+ "        }";
		  
			RestAssured.baseURI="https://reqres.in/";// create and insert the data
			given().header("content-type","application/json").body(payload).
			when().post("api/users").
			then().log().all().assertThat()
			                .statusCode(201).assertThat().body("email", equalTo("kiruba.karan@reqres.in"));

	  }*/
	@Test
	public void test1()
	{
		String payload = "{\r\n"
				+ "\"location\":{\r\n"
				+ "\"lat\":-38.383494,\r\n"
				+ "\"lng\":33.427362\r\n"
				+ "},\r\n"
				+ "\"accuracy\":50,\r\n"
				+ "\"name\":\"Fontline house\",\r\n"
				+ "\"phone_number\":\"(+91)983 893 3937\",\r\n"
				+ "\"address\":\"29,side layout,cohen 09\",\r\n"
				+ "\"types\":[\r\n"
				+ "\"shoe park\",\r\n"
				+ "\"shop\"\r\n"
				+ "],\r\n"
				+ "\"website\":\"http://google.com\",\r\n"
				+ "\"language\":\"Frensch_IN\"\r\n"
				+ "}";
		RestAssured.baseURI="https://rahulshettyacademy.com";
		given()
	    .header("Content-Type", "application/json")
	    .queryParam("key", "qaclick123")
	    .body(payload)
	    .when()
	    .post("/maps/api/place/add/json")
	    .then()
	    .log().all()
	    .assertThat().statusCode(200)
	    .assertThat().body("status", equalTo("OK"));	
	}
}
