package com.ey.collections.q1;


public class Student {

	int age;
	String firstname;
	String lastname;
	Address address;
	public Student(int age, String firstname, String lastname, Address address) {
		this.age = age;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
				+ "]";
	}
	

}
