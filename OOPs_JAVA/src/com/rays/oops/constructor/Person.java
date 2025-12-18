package com.rays.oops.constructor;

import java.util.Date;

public class Person {
	private String name;
	private String address;
	private Date dob;
	public static final int AVR_AGE = 18;

	public Person(String name, String address, Date dob, int AVR_AGE) {
		this.name = name;
		this.address = address;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public Date getDob() {
		return dob;
	}

	public static int getAge(Date dob) {
		Date now = new Date();
		int currentYear = now.getYear();
		int dobYear = dob.getYear();
		int age = currentYear - dobYear;
		return age;

	}

}
