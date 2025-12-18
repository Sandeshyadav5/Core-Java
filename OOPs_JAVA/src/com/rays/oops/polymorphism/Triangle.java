package com.rays.oops.polymorphism;

public class Triangle extends Shape {
	private int height;
	private int base;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getbase() {
		return base;
	}

	public void setbase(int base) {
		this.base = base;
	}

	public void area() {
		System.out.println("Area of Circle is =  " + ((height * base) / 2));

	}

}
