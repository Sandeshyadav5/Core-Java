package com.rays.oops;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TestPerson {
	public static void main(String[] args) throws ParseException  {
		Person sandesh=new Person();
	
		sandesh.setName("Sandesh");
		sandesh.setAdress("Bhanpura");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date dob = sdf.parse("05-09-2001");
        sandesh.setDob(dob);
		

		System.out.println("Name  = "+sandesh.getName());
		System.out.println("Adress  =  "+sandesh.getAdress());
		System.out.println("Date of Birth = " + sdf.format(sandesh.getDob()));	
		int age = Person.getAge(sdf.parse(sdf.format(sandesh.getDob())));
		if(age<Person.AVR_AGE) {
			System.out.println("Sandesh you Are Not Eligible for Vote because your Age is =  "+age);
		}else {
			System.out.println("Sandesh you are eligible for Vote and your Age is =  "+age);
		}}

}
