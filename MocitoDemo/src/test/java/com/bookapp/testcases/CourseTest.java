package com.bookapp.testcases;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Spy;

import com.bookapp.service.Course;

class CourseTest {
	@Spy
 Course course;
	
	@Mock
Course mcourse;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		course=new Course();
	}

	@AfterEach
	void tearDown() throws Exception {
		course= null;
	}

	@Test
	void testcourse() {
			List<String> courses= course.showCourses();
		 assertEquals(3, courses.size());
		 assertEquals(Arrays.asList("java","Spring","Angular"),courses);
		 assertNotNull(courses);
		}
	@Test
	void testcourseSpy() {
		//the Original method is called
	    List<String> courses= course.showCourses();
		System.out.println(courses);
		}
		
	
	@Test
	void testcoursesMock() {
		//call the proxy method using object and return same data
		when(mcourse.showCourses()).thenReturn(Arrays.asList("java"));
		//the mock object call the proxy method .original method is not called
		//using  when()thenRetturn()to call the proxy method and return same data
		List<String> courses= mcourse.showCourses();
		System.out.println(courses);
	}
		
	}


