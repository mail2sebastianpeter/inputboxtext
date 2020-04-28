package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculatorService {

	int a=11, b=20;
	
	@Test
	public void testsum() {
	CalculatorService cal = new CalculatorService();
	Assertions.assertEquals(30, cal.sum());
	System.out.println("This is a Sample text test sum test case");
	
	}
	
	
}
