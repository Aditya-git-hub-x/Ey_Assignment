package com.ey.oops.task;

import java.util.Arrays;
import java.util.Date;

public class Student {
	
	private Integer admissionCode;
	private String studentName;
	private Date birthdate;
	private Integer []marks;
	private String grade;
	private static Integer admissionCounter;
	private static String SchoolName;
	
	static {
		SchoolName="Hyderabad Public School";
	}
	
	public Student() {
		this.admissionCode = admissionCounter + 100;
	}
	
	public Student(String studentName, Date birthdate) {
		this.studentName = studentName;
		this.birthdate = birthdate;
	}
	
	public Student(String studentName, Date birthdate, Integer[] marks) {
		this(studentName, birthdate);
		this.marks=marks;
	}
	
	


	public Integer getAdmissionCode() {
		return admissionCode;
	}

	public void setAdmissionCode(Integer admissionCode) {
		this.admissionCode = admissionCode;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Integer[] getMarks() {
		return marks;
	}

	public void setMarks(Integer[] marks) {
		this.marks = marks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade() {
		
		int totalmarks = Arrays.stream(marks).mapToInt(Integer::intValue).sum();
		if(totalmarks>=240 && totalmarks<=300)
			grade="Excellent";
		if(totalmarks>=180 && totalmarks<=239)
			grade="Good";
		if(totalmarks>=150 && totalmarks<=179)
			grade="Average";
		if(totalmarks<150)
			grade="Fail";
		
		this.grade = grade;
	}

	public static Integer getAdmissionCounter() {
		return admissionCounter;
	}

	public static void setAdmissionCounter(Integer admissionCounter) {
		Student.admissionCounter = admissionCounter;
	}

	public static String getSchoolName() {
		return SchoolName;
	}

	public static void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Student [admissionCode=" + admissionCode + ", studentName=" + studentName + ", birthdate=" + birthdate
				+ ", marks=" + Arrays.toString(marks) + ", grade=" + grade + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student.setAdmissionCounter(admissionCounter);
		Student.setSchoolName(SchoolName);
	}


}
