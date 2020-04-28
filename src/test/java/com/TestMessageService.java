package com;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestMessageService {
	
	
	@Test
 	public void testMessage() {
		MessageService MessageService = new MessageService();
		System.out.println("hello");
		Assertions.assertEquals(MessageService.sayHello(), "Hello Engineers");
	}
	
	@Test
	public void testdevops() {
		MessageService ms = new MessageService();
		System.out.println("Successfully validated the devops test csse");
		Assertions.assertEquals(ms.welcomeDevops(), "Welcome to the world of DevOps");
	}
	
	@Test
	public void Page1() {
		MessageService ms = new MessageService();
		System.out.println("This is a Sample text For testing the pages");
		Assertions.assertEquals(ms.Page1(), "This is a Sample text For testing the pages");
	}
	
	@Test
	public void Page2() {
		MessageService ms = new MessageService();
		System.out.println("This is a Sample text For testing the pages2");
		Assertions.assertEquals(ms.Page2(), "This is a Sample text For testing the pages2");
	}
}
