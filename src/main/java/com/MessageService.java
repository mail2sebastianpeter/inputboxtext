package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageService {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Engineers";
	}
	
	@GetMapping("/devops")
	public String welcomeDevops(){
		return "Welcome to the world of DevOps";
	}
	
	@GetMapping("/page1")
	public String Page1(){
		return "This is a Sample text For testing the pages";
	}
	@GetMapping("/page2")
	public String Page2(){
		return "This is a Sample text For testing the pages2";
	}
}
