package in.co.rays.basic;

import java.util.Scanner;

public class TestCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		
		System.out.println("Enter an number:");
		int b = sc.nextInt();
		System.out.println("Choose oper: +,-,*,/,%");
		String opr = sc.next();
		switch(opr) {
		case "+" :
			System.out.println("result: "+ (a+b));
			break;
		case "-" :
			System.out.println("result: "+ (a-b));
			break;
		case "*" :
			System.out.println("result: "+ (a*b));
			break;
		case "/" :
			System.out.println("result: "+ (a/b));
			break;
		case "%" :
			System.out.println("result: "+ (a%b));
			break;
			default:
				
	}

}
	
}
