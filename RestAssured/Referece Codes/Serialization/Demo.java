package Serialization;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
public class Demo {
public static void main (String [] arg)
{
	Product product = new Product();
	product.setName("HP 16");

	Data data = new Data();
	data.setYear(2019);
	data.setPrice(1849.99);
	data.setCpuModel("Intel Core i9");
	data.setHardDiskSize("1 TB");

	product.setData(data);
	RestAssured.baseURI="https://api.restful-api.dev/objects";
	given()
	    .contentType(ContentType.JSON)
	    .body(product)  		 // POJO → JSON
	.when()
	    .post()
	.then()
	    .log().all();

}
}
