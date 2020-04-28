package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
	@GetMapping("/sum")
	public int sum() {
		int a=10, b=20;
		return a+b;
	}
	

}
