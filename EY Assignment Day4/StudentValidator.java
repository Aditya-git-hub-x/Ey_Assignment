package com.ey.oops.task;

import java.util.Date;
import java.util.Calendar;

public class StudentValidator {
	
	public boolean isValidStudentName(Student student) {
		return student.getStudentName().matches("[a-ZA-z]+");
	}
	
	public boolean isValidStudentBirthdate(Student student) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, -5);
		Date fiveYearsAgo = calendar.getTime();
		return student.getBirthdate().before(fiveYearsAgo);
	}
	
	public boolean isValidStudentMarks(Integer[] marks) {
		if(marks!=null && marks.length==3) {
			for(Integer mark:marks) {
				if(mark<0||mark>100) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	public boolean isValidStudent(Student student) {
		return isValidStudentName(student) && isValidStudentBirthdate(student) && isValidStudentMarks(student.getMarks());
		
	}
}
