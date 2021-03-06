package com.assignment1.restAssured.task2;

import org.junit.Assert;
import org.testng.Reporter;
import static com.jayway.restassured.RestAssured.given;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.SSLConfig;
import com.jayway.restassured.response.Response;

public class ExecuteAPI {
	public static void main(String args[]) {
		RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().relaxedHTTPSValidation());
		String url="http://api.openweathermap.org/data/2.5/weather?q=London&";
		Response response = given().that().queryParam("appid","e72c7be33562a4d824862a5e6717d4f9").when().get(url).andReturn();
		String res=response.getBody().asString();
		int resCode=response.getStatusCode();
		Reporter.log("The response Body is " + res,true);
		Assert.assertEquals(resCode,200);
		Reporter.log("The response Code is " + resCode,true);
	}
}

