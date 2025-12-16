package com.rays.oops;

import java.util.Date;

public class Person {
	private String name;
	private Date dob;
	private String adress;
	public static final int AVR_AGE = 18;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public static int getAge(Date dob) {
		Date now = new Date();
		int currentYear = now.getYear();
		int dobYear = dob.getYear();
		int age = currentYear - dobYear;
		return age;

	}

}
