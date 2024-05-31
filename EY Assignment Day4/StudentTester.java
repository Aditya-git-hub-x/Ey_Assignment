package com.ey.oops.task;
import java.util.Date;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student students[]=new Student[5];
		Integer a[]= {45,42,67};
		students[0]=new Student("ramesh1",new Date(103,4,6),a);
		students[1]=new Student("ramesh2",new Date(104,5,8),a);
		students[2]=new Student("ramesh3",new Date(102,1,2),a);
		students[3]=new Student("ramesh4",new Date(107,3,4),a);
		students[4]=new Student("ramesh5",new Date(108,3,4),a);
		StudentService sc=new StudentService();
		sc.ShowStudentDetails(students);
	}

}
