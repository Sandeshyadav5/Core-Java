package in.co.rays.string;

import java.time.LocalDate;

public class TestLocalDate {
	public static void main(String[] args) {
		LocalDate now =LocalDate.now();
		
		System.out.println("Now"+now.getDayOfMonth());
		System.out.println("Now"+now.getDayOfWeek());
		System.out.println("Now"+now.getDayOfYear());
		System.out.println("Now"+now.getMonth());
		System.out.println("Now"+now.getYear());
		LocalDate Dob =LocalDate.of(2001,9,05);
		System.out.println("dob date"+Dob);
		System.out.println("dob"+Dob.getDayOfMonth());
		System.out.println("dob"+Dob.getDayOfWeek());
		System.out.println("dob"+Dob.getDayOfYear());
		System.out.println("dob"+Dob.getMonth());
		System.out.println("dob"+Dob.getYear());
		System.out.println("------------------------------------");
		System.out.println("Age  :"+(now.getYear() - Dob.getYear()));
	}

}
