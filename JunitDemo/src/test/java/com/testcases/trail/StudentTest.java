package com.testcases.trail;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.vfislk.exceptions.InvalidNumException;
import com.vfislk.exceptions.NegValueException;
import com.vfislk.training.Student;

class StudentTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
    Student student;
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		student=new Student();
	}

	@AfterEach
	void tearDown() throws Exception {
		student=null;
	}

	@Test@DisplayName("testing calcTotal")
	void testCalcTotal() throws NegValueException, InvalidNumException{
		
		assertEquals(18, student.calcTotal(10, 2, 6));
	}
	
	@Test @DisplayName("testing negative value")
	void testNegTotal() {
//		assertThrows(NegValueException.class,()->{
//			student.calcTotal(78,73,9);
//	});
		assertThrows (NegValueException.class,()->student.calcTotal(-90,69,76));
		}	
    @Test @DisplayName("Testing marks greater than 100")
    void testGreaterTotal() throws InvalidNumException, NegValueException{
    	assertEquals(18, student.calcTotal(10, 2, 6));
    	 }
    @Tag("A")
    @Test @DisplayName("Testing for grade A")
    void testGetGrade() {
    	int[] marks= {90,95,89};
    	String grade=student.getGrades(marks);
    	assertEquals("A",grade,"Expecting grade A");
    	 }
    @Test @DisplayName("Testing for grade B ")
    void testGetGradeB() {
    	int[] marks= {86,81,80};
    	String grade=student.getGrades(marks);
    	assertEquals("B",grade,"Expecting grade B");
    	 }
    @Test @DisplayName("Testing for grade C")
    void testGetGradeC() {
    	int[] marks= {75,73,70};
    	String grade=student.getGrades(marks);
    	assertEquals("C",grade,"Expecting grade C");
    	 }
    @Test @DisplayName("Testing for grade D")
    void testGetGradeD() {
    	int[] marks= {60,73,60};
    	String grade=student.getGrades(marks);
    	assertEquals("D",grade,"Expecting grade D");
    	 }
    @Test @DisplayName("Testing for grade Fail")
    void testGetGradeE() {
    	int[] marks= {30,50,40};
    	String grade=student.getGrades(marks);
    	assertEquals("Fail",grade,"Expecting grade Fail");
    	 }
    @Test @DisplayName("Testing for null value")
    void testGetGradeNull() {
    	int[] marks= null;
    	String grade=student.getGrades(marks);
    	assertEquals(null,grade,"Expecting grade null value");
    	 }
    @Tag("wrong")
    @Test @DisplayName("Testing for invalid marks")
    void testGetGradeinvalidnumber() {
    	int[] marks= {-60,102,67};
    	
    	assertThrows(InvalidNumException.class,()->student.getGrades(marks),"Expecting invalid marks");
    	 }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
