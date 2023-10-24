package api.Endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.util.ResourceBundle;

import api.PayLoad.User; //This package is imported for accessing POJO class.

public class UserEndpoints2 {
	
	static ResourceBundle getURL(){
		ResourceBundle routes=ResourceBundle.getBundle("routes");
		return routes;
	}
	

	public static Response createUser(User PayLoad) {
		String post_url=getURL().getString("post_URL");
	Response response=given()
				.contentType("application/json")
				.accept("application/json")
				.body(PayLoad)
			.when()
				.post(post_url);
	return response;
	}
	
	public static Response readUser(String userName) {
		
		Response response=given()
					.pathParam("username", userName)
				.when()
					.get(getURL().getString("get_URL"));
		return response;
		}
	
	public static Response updateUser(String userName, User PayLoad) {
		
		Response response=given()
					.contentType(ContentType.JSON)
					.accept(ContentType.JSON)
					.pathParam("username", userName)
					.body(PayLoad)
				.when()
					.put(getURL().getString("put_URL"));
		return response;
		}
	
	public static Response deleteUser(String userName) {
		
		Response response=given()
					.pathParam("username", userName)
				.when()
					.delete(getURL().getString("delete_URL"));
		return response;
		}
	
}
