package com.bookapp.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bookapp.service.OrderDetails;

class OrderDemoTest {
	OrderDetails details;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	details=new OrderDetails(); 
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testShowMessage() {
		Mockite.when(bookservice.greetMessage()).thenReturn("Great Dy");
		String actual=details.showMessage("Priya");
		assertEquals("Grat Day Priya", actual);
		String actual=details.showMessage("Prachi");
		assertEquals("Great Day Prachi",actual);
		
	}

}
