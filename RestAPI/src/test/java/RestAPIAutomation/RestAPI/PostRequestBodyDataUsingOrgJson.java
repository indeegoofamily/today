package RestAPIAutomation.RestAPI;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequestBodyDataUsingOrgJson 
{
public static void main(String[] args) 
{

	JSONObject s=new JSONObject();
	s.put("firstname", "Abhi");
	s.put("lastname", "Ajmera");
	s.put("id", "7");
	s.put("designation", "AM");
	
	Response res=
	given()
	.contentType(ContentType.JSON)
	.body(s.toString())
	.when()
	.post("http://localhost:3000/APIFolksList");
	System.out.println("Status code is : "+res.statusCode());
}
}
