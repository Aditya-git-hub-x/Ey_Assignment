package com.ey.exceptions;
import java.util.*;

import java.time.LocalDate;
import java.util.Date;

public class ContactRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contact c = new Contact("challaplli","meghana","sai",LocalDate.of(2002, 01, 31),"female","983736373");
		Contact c1 = new Contact("challaplli","meghana2","sai",LocalDate.of(2002, 01, 31),"female","983755373");
		Stack s=new Stack();
		s.push(c);
		System.out.println(s.pop());
		s.push(c);
		for(int i=0;i<5;i++) {
			s.push(c1);
		}
		
		System.out.println(s);
	}
}
