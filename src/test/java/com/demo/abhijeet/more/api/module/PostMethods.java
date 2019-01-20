package com.demo.abhijeet.more.api.module;


import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.ValidatableResponse;

/***
 * 
 * @author Abhijeet More
 *
 */
public class PostMethods {

	private String bodyToSend;
	private String endpoint;
	private ValidatableResponse statusResponseCode;
	

	/**
	 * This is an example class to make a post in a service Rest currently is not
	 * activated.
	 * 
	 * @param newCodeContry
	 *            this is an String with the new country code.
	 * @return ValidatableResponse this is the response code of the post.
	 */
	public ValidatableResponse postANewCountry(String newCodeContry) {
		bodyToSend = "{ name: \"Test Country\",alpha2_code: \"TC\",alpha3_code: \"TCY\"}";
		endpoint = "http://services.groupkt.com/country/post";

		statusResponseCode = RestAssured.given().contentType("application/json; charset=UTF-8").body(bodyToSend).when().post(endpoint).then()
				.statusCode(200);
		return statusResponseCode;
	}

}
