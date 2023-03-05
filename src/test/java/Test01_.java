import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test01_ {

@Test
		void test_01() {
	Response respnce = RestAssured.get("https://reqres.in/api/users?page=2");
	System.out.println(respnce.asString());
		}

	}


