package apiPageObjects;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SetUp {
	public Response response;
	public RequestSpecification request;
	
	public SetUp () {
		RestAssured.baseURI = "http://reqres.in/api/";
		request = RestAssured.given();
				
	}
	
}
