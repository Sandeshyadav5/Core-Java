package com.rays.exception.custom;

public class TestLoginException {
	public static void main(String[] args) throws LoginException {
		String Login="admin";
		
		if (Login=="admin") {
			System.out.println("user found");
		}
		else {
			throw new LoginException("Invalid login id");
		}
	}

}
