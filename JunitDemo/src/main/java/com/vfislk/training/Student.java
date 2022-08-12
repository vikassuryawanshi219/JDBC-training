package com.vfislk.training;

import com.vfislk.exceptions.InvalidNumException;
import com.vfislk.exceptions.NegValueException;

public class Student {
	public int calcTotal(int x, int y, int z) throws NegValueException, InvalidNumException {
		if (x < 0 || y < 0 || z < 0) {
			throw new NegValueException("marks should be greater than zero");
		}
		if (x > 100 || y > 100 || z > 100) {
			throw new InvalidNumException("marks should be less than hundread");
		}
		return (x + y + z);
	}


	public String getGrades(int[] marks) {
		int sum = 0, avg = 0;
		String grade = null;
		if (marks==null)
			return null;
		for (int score : marks) {
			if(score <0||score>100)
				throw new InvalidNumException();
		
			sum = sum + score;
		}
		avg = sum / marks.length;
		

		if (avg > 90) {
			grade = "A";
		}
		if (avg > 80 && avg < 90) {
			grade = "B";
		}
		if (avg > 70 && avg < 80) {
			grade = "C";
		}
		if (avg > 60 && avg < 70) {
			grade = "D";
		}
		if (avg < 60) {
			grade = "Fail";
		}
		return grade;

//	if (avg>90) {
//		return "A"
//	}
//	return "complete"
	}
}
