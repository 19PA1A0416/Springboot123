package com.AqeTesting.demoAQE;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class demo_class {
	@GetMapping("/in")
	public String show() {
		String s="Hi ,Welcome to spring boot and jenkins";
		return s + "Id :128" + "Name:Swathi" ;
	}
}
