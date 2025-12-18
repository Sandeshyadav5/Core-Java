package com.rays.oops.encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		
		Account sandesh=new Account();
		Account durgesh=new Account();
		
		sandesh.setNumber("6342578346");
		sandesh.setAccountType("Savings");
		sandesh.setBalance(15000);
		
		System.out.println("Sandesh's Account Number =   "+sandesh.getNumber());
		System.out.println("Sandesh's Account Type =   "+sandesh.getAccountType());
		System.out.println("Sandesh's Account Balance =   "+sandesh.getBalance());
		sandesh.Deposit(5000);
		sandesh.Withdrawl(1900);
		sandesh.Paybill(1800);
		sandesh.FundTransfer(durgesh,100);
		
		durgesh.setNumber("364775643756");
		durgesh.setAccountType("Current");
		durgesh.setBalance(130000);
		
		System.out.println("durgesh's Account Number =   "+durgesh.getNumber());
		System.out.println("durgesh's Account Type =   "+durgesh.getAccountType());
		System.out.println("durgesh's Account Balance =   "+durgesh.getBalance());
		durgesh.Deposit(0);
		durgesh.Withdrawl(0);
		durgesh.Paybill(0);
		durgesh.FundTransfer(sandesh,100);

	}

}
