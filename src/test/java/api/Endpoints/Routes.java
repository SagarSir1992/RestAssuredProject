package api.Endpoints;

//Create User(Post)==https://petstore.swagger.io/v2/user
//Get User(Get)==https://petstore.swagger.io/v2/user/{UserName}
//Update User(Put)==https://petstore.swagger.io/v2/user/{UserName}
//Delete User(Delete)==https://petstore.swagger.io/v2/user/{UserName}

public class Routes {
	
	public static String base_URL="https://petstore.swagger.io/v2";
	
	//For User Module.
	public static String post_URL=base_URL+"/user";
	public static String get_URL=base_URL+"/user/{username}";
	public static String put_URL=base_URL+"/user/{username}";
	public static String delete_URL=base_URL+"/user/{username}";

	//For Store Module.
	
	//For Pet Module.
	
	

}
