package com.rays.oops.polymorphism;

public class Circle extends Shape {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println("Area of circle is = " + Math.PI * radius * radius);
	}
}
