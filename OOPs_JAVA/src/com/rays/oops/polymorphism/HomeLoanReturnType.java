package com.rays.oops.polymorphism;

public class HomeLoanReturnType {
	public static void main(String[] args) {
		Bank [] b=new Bank[3];
		b[0]=Bank.getBank(1);
		b[1]=Bank.getBank(2);	
		b[2]=Bank.getBank(3);	
	loanEnquiry(b);
}
public static void loanEnquiry(Bank[] b) {
	for(Bank b1:b) {
		String name=b1.getName();
		double rate=b1.interestRate();
		System.out.println(name+" = "+rate);
		}
}

}
