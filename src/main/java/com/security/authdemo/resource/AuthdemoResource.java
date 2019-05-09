package com.security.authdemo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.authdemo.model.Greeting;

@RestController
@RequestMapping("/rest/auth")
public class AuthdemoResource {

	
	@GetMapping("/greet")
	public Greeting greeting() {
		
		Greeting greet = new Greeting();
		greet.setName("Hello AuthDemo");
		return greet;
	}
}
