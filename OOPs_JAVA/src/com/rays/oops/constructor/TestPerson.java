////package com.rays.oops.constructor;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import com.rays.oops.Person;
//
//public class TestPerson {
//	public static void main(String[] args) throws ParseException {
//		SimpleDateFormat sdf= new SimpleDateFormat("yyy-MM-dd");
//		
//		Person p1=new Person("sandesh", "Indore",  sdf.parse("2000-12-30"),36);
//		System.out.println(p1.getName());
//		System.out.println(p1.getAddress());
//		System.out.println(p1.getDob());
//		int age = Person.getAge(sdf.parse(sdf.format(p1.getDob())));
//
//		if(age<Person.AVR_AGE) {
//			System.out.println("Sandesh you Are Not Eligible for Vote because your Age is =  "+age);
//		}else {
//			System.out.println("Sandesh you are eligible for Vote and your Age is =  "+age);
//		}
//		
//	}
//}
