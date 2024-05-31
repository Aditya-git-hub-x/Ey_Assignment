package com.ey.oops.task;
import java.util.Date;

public class StudentService {
	
	public void ShowStudentDetails(Student []s) {
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}
}
