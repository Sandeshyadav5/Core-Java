package com.rays.Io;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int intvalue;
		System.out.println("Please Enter any Integer Number......");
		intvalue=sc.nextInt();
		System.out.println("Entered Integer = "+intvalue);
		
		float floatvalue;
		System.out.println("Please Enter any Float Number......");
		floatvalue=sc.nextFloat();
		System.out.println("Entered Float = "+floatvalue);
		
		double doublevalue;
		System.out.println("Please Enter any Double Number......");
		doublevalue=sc.nextDouble();
		System.out.println("Entered Double = "+doublevalue);
		sc.nextLine(); 
		String linevalue;
		System.out.println("Please Enter any String......");
		linevalue=sc.nextLine();
		System.out.println("Entered String = "+linevalue);
		
		String wordvalue;
		System.out.println("Please Enter any word......");
		wordvalue=sc.next();
		System.out.println("Entered word = "+wordvalue);
		sc.close();
	}

}
