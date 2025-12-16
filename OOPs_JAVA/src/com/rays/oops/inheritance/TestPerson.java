package com.rays.oops.inheritance;

public class TestPerson {
	public static void main(String[] args) {
		
		System.out.println("---------------Businessman-----------------");
		System.out.println("");
		
		Businessman b=new Businessman();
		
		b.setIncome(250000);
		
		System.out.println("Income of b is =  "+b.getIncome());
		System.out.println("");

		System.out.println("---------------Doctor-------------");
		System.out.println("");

		
		
		Doctor d=new Doctor();
		
		d.setRegistrationNo("5679");
		
		System.out.println("Registration no. of d is =  "+d.getRegistrationNo());
		System.out.println("");

		
		System.out.println("--------------Student---------------");
		System.out.println("");

		
		Student s=new Student();
		
		s.setMarks(88);
		s.setRollNo("37473457768");

		System.out.println("Roll No. of s is =  "+s.getRollNo());
		System.out.println("Marks of s is =  "+s.getMarks());
		
	}

}
