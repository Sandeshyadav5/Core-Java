package in.co.rays.string;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class TestPeriodBetween {
	public static void main(String[] args) {
		LocalDate Dob=LocalDate.of(2001, 9,05);
		LocalDate Today=LocalDate.now();
		Period p1=Period.between(Dob, Today);
		System.out.println("DOB : "+Dob+"  Today's Date : "+Today);
		System.out.println("Years"+p1.getYears());
		System.out.println("Months"+p1.getMonths());
		System.out.println("Days"+p1.getDays());
		System.out.println(p1);
	}

}
