package com.rays.oops.constructor;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobile a1 = new Automobile("Green", 200, "Toyota");
		System.out.println(a1.getColor());
		System.out.println(a1.getSpeed());
		System.out.println(a1.getMake());
	}

}
