package com.ey.collections.q4;

public class Employeetester {
	public static void main(String[] args) {
		Employeevalidator ev= new Employeevalidator();
		Employee e1=new Employee(1,"sai","Laxman");
		Employee e2=new Employee(2,"ram","Laxman");
		Employee e3=new Employee(3,"max","Laxman");
		Employee e4=new Employee(4,"raj","Laxman");
		Employee e5=new Employee(5,"mark","Laxman");
		ev.addemployee(e1);
		ev.addemployee(e2);
		ev.addemployee(e3);
		ev.addemployee(e4);
		ev.addemployee(e5);
		
		ev.list();
		
		ev.fnamesort();
		
	}

}
