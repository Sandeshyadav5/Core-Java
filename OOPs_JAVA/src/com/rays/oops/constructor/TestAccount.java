package com.rays.oops.constructor;

public class TestAccount {
	public static void main(String[] args) {
		Account a1 = new Account("763476248998", "Savings", 100000.0);
		System.out.println(a1.getNumber());
		System.out.println(a1.getAccountType());
		System.out.println(a1.getBalance());
		a1.Deposit(3348);
		a1.Withdrawl(15000);
		a1.Paybill(5000);
		a1.FundTransfer(a1, 3433);
	}

}
