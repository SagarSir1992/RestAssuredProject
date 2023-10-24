package api.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.Endpoints.UserEndpoints;
import api.PayLoad.User;
import api.Utilities.DataProviders;
import io.restassured.response.Response;

public class DataDrivenTest {

	@Test(priority=1, dataProvider="Data", dataProviderClass=DataProviders.class)
	public void testPostUser(String userId,String userName, String firstName, String lastName, String email, String password, String phoneNum){
		
		User userPayload=new User();
		
		userPayload.setId(Integer.parseInt(userId));
	    userPayload.setUsername(userName);
	    userPayload.setFirstName(firstName);
	    userPayload.setLastName(lastName);
	    userPayload.setEmail(email);
	    userPayload.setPassword(password);
	    userPayload.setPhone(phoneNum);
		
		Response response=UserEndpoints.createUser(userPayload);
		
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test(priority=2, dataProvider="UserNames", dataProviderClass=DataProviders.class)
	public void testDeleteUser(String userName){
		Response response=UserEndpoints.deleteUser(userName);
		
		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
