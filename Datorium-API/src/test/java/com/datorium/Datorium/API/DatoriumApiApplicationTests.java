package com.datorium.Datorium.API;

import com.datorium.Datorium.API.Services.UserService2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class DatoriumApiApplicationTests {

	@Test
	void contextLoads() {
	}

	// Hey, I need a method, that gives me my fullname
	@Test
	void WHEN_NameIsOskarsAndSurnameIsKlaumanis_THEN_Result_Oskars_Klaumanis() {
		//Arrange -> prepare data and services
		var userService = new UserService2();

		//Act -> Do some action, usually call a method
		var fullname = userService.getFullName("Oskars", "Klaumanis");

		//Assert -> Test whether or not the result is correct
		Assert.isTrue(fullname.equals("Oskars Klaumanis"), "Hey, the name should be with a space inbetween and should contain both name and surname");
	}

}
