package com.rays.oops.constructor;

public class Account {
	private String number;
	private String accountType;
	private double balance;

	public Account(String number, String accountType, double balance) {
		this.number = number;
		this.accountType = accountType;
		this.balance = balance;

	}

	public String getNumber() {
		return number;
	}

	public String getAccountType() {
		return accountType;
	}

	public void Deposit(double amount) {
		this.balance = balance + amount;
		System.out.println("Total Balance After Deposit=  " + balance);
	}

	public void Withdrawl(double amount) {
		this.balance = balance - amount;
		if (amount > balance) {
			System.out.println("Insufficient Balance In Your Account");
		} else {
			System.out.println("Total Balance After Withdrawl=   " + balance);
		}

	}

	public void FundTransfer(Account target, double amount) {
		this.balance = balance - amount;
		target.balance = balance;

		System.out.println(
				"Total Balance Transfered=   " + amount + "  Remaining Balance after transfered =  " + balance);

	}

	public void Paybill(double amount) {
		this.balance = balance - amount;
		if (amount > balance) {
			System.out.println("Insufficient Balance to Pay Bill");
		} else {
			System.out.println("Total Balance Paid =     " + amount + "  And Remaining Balance is =  " + balance);
		}

	}

	public double getBalance() {
		return balance;
	}

}
