package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestOddEvenService {

	@Test
	public void testeven() {
		OddEvenService num = new OddEvenService();
		Assertions.assertEquals(num.even(),"Even");
		System.out.println("Even Function checker");
	}
	
	@Test
	public void testodd() {
		OddEvenService num = new OddEvenService();
		Assertions.assertEquals(num.odd(),"Odd");
		System.out.println("Odd Function checker");
	}
	
	@Test
	public void testzero() {
		OddEvenService num = new OddEvenService();
		Assertions.assertEquals(num.zero(),"Zero");
		System.out.println("Zero number Function checker");
	}
	
}
