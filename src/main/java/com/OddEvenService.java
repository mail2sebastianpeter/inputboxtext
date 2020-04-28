package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OddEvenService {
	
	@GetMapping("/even")
	public String even() {
		int a=10;
		if((a%2)==0)
			return "Even";
		return "Even";
	}
	
	@GetMapping("/odd")
	public String odd() {
		int a=10;
		if((a%2)!=0)
			return "Odd";
		return "Odd";
	}
	
	@GetMapping("/zero")
	public String zero() {
		int a=0;
		if(a==0)
			return "Zero";
		return "Zero";
	}
}
