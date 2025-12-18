package com.rays.oops.constructor;

public class Automobile {
	private String color;
	private int speed;
	private String make;

	public Automobile(String color, int speed, String make) {
		this.color = color;
		this.speed = speed;
		this.make = make;

	}

	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}

	public String getMake() {
		return make;
	}

}
