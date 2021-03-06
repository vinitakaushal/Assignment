package com.assignment1.restAssured;
import org.testng.Reporter;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;
import com.assignment1.restAssured.task1.model.*;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.SSLConfig;
import com.jayway.restassured.response.Response;
public class ParseJSONContent {
	
	@Test
	public void validate(){
		RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().relaxedHTTPSValidation());
		String url="http://api.openweathermap.org/data/2.5/weather?q=London&appid=e72c7be33562a4d824862a5e6717d4f9";
		Response response = given().that().queryParameter("q", "London").when().get(url).andReturn();
		String res=response.getBody().asString();
		int resCode=response.getStatusCode();
		Reporter.log("The response Body is " + res,true);
		Reporter.log("The response Code is " + resCode,true);
		
			Gson gson = new Gson();
			Type type = new TypeToken<Message>() {
			}.getType();
			Message message = gson.fromJson(res, type);
			List<Weather> weather=message.getWeather();
			Reporter.log("TimeZone is :"+ message.getTimezone(),true);
			for(Weather ele:weather) {
				Reporter.log("Weather List contains : "+ele.getMain(),true);
			}
	}
}

