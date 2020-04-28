package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
	@GetMapping("/sum")
	public int sum() {
		int a=11, b=22;
		return a+b;
	}
	
	@GetMapping("/mul")
	public int mul() {
		int a=11, b=22;
		return a*b;
	}
	@GetMapping("/div")
	public int div() {
		int a=10, b=2;
		return a/b;
	}
}
