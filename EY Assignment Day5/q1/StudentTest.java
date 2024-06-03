package com.ey.collections.q1;

public class StudentTest {
	public static void main(String[] args) {
		Studentservice ss= new Studentservice();
		
		
		Address a1=new Address("Chennai");
		Student s1=new Student(25,"Mukesh","kumar",a1);
		
		Address a2=new Address("Bangalore");
		Student s2=new Student(26,"Suresh","kumar",a2);
		
		Address a3=new Address("Bangalore");
		Student s3=new Student(28,"Suresh","kumar",a2);
		
		System.out.println(ss.addProduct(s1));
		System.out.println(ss.addProduct(s2));

		ss.listStudents();
		
		System.out.println(ss.isvalidStudent(s1, s2));
		System.out.println(ss.isvalidStudent(s2, s3));
		
	}

}