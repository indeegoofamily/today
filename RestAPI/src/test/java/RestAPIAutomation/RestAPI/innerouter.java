package RestAPIAutomation.RestAPI;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class innerouter 
{
	public static void main(String[] args) 
	{

		JSONObject innerObject=new JSONObject();
		innerObject.put("Street Name", "AIT");
		innerObject.put("H.no.", "147");
		innerObject.put("landmark", "Hm");
		
		JSONObject outerObject=new JSONObject();
		
		outerObject.put("firstname", "Abhi");
		outerObject.put("lastname", "Ajmera");
		outerObject.put("id", "5");
		outerObject.put("designation", "AM");
		outerObject.put("Address",innerObject);
		
		System.out.println(outerObject);
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(outerObject.toString())
		.when()
		.post("http://localhost:3000/APIFolksList");
		System.out.println("Status code is : "+res.statusCode());
	}
}
