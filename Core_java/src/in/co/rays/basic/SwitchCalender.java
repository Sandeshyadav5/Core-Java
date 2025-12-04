package in.co.rays.basic;

import java.util.Scanner;

public class SwitchCalender {
	public static void main(String[] args) {
		Scanner du=new Scanner(System.in);
		
		System.out.println("Enter month name: ");
		String a=du.next();
		switch(a) {
		case "january":
			System.out.println("1st month of the year");
			break;
		case "fabuary":
			System.out.println("2nd month of the year");
			break;
		case "march":
			System.out.println("3rd month of the year");
			break;
		case "april":
			System.out.println("4th month of the year");
			break;
		case "may":
			System.out.println("5th month of the year");
			break;
		case "june":
			System.out.println("6th month of the year");
			break;
		case "july":
			System.out.println("7th month of the year");
			break;
		case "august":
			System.out.println("8th month of the year");
			break;
		case "september":
			System.out.println("9th month of the year");
			break;
		case "october":
			System.out.println("10th month of the year");
			break;
		case "november":
			System.out.println("11th month of the year");
			break;
		case "december":
			System.out.println("12th month of the year");
			break;
			default:
				System.out.println("invalid month");
		}
	}

}
