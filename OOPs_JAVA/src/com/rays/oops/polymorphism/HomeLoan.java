//package com.rays.oops.polymorphism;
//
//public class HomeLoan {
//	public static void main(String[] args) {
//		Bank [] b=new Bank[3];
//		b[0]= new AxisBank();
//		b[1]= new HdfcBank();
//		b[2]= new IciciBank();
//		loanEnquiry(b);
//	}
//	public static void loanEnquiry(Bank[] b) {
//		for(Bank b1:b) {
//			String name=b1.getName();
//			double rate=b1.interestRate();
//			System.out.println(name+" = "+rate);
//			}
//	}
//
//}
