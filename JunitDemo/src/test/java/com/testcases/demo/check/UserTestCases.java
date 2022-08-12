package com.testcases.demo.check;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.vfislk.training.User;

class UserTestCases {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
    User user;
	@BeforeEach
	void setUp() throws Exception {
		user=new User();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test@DisplayName("test greet")
	void testGreet() {
		assertEquals("Welcome Vikas",user.greet("Vikas"));
		
	}

	@Test@DisplayName("test fruit")
	void testFruit() {
		List<String> fruit= Arrays.asList("mango","apple","peach");
		assertEquals(fruit,user.showFruits());
		}
	@Test@DisplayName("test fruit")
	void testFruitLength() {
		List<String> fruit= Arrays.asList("mango","apple","peach");
		assertEquals(3,user.showFruitscount().size());
		}
}
