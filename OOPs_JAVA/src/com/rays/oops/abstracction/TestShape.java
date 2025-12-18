package com.rays.oops.abstracction;

public class TestShape {
	public static void main(String[] args) {
		Shape s1=new Circle();
		Shape s2=new Rectangle();
		Shape s3=new Triangle();
		
		Circle c= (Circle) s1;
		c.setRadius(2);
		System.out.println("Area of circle: "+c.area());
		
		Rectangle r=(Rectangle) s2;
		r.setLength(15);
		r.setWidth(6);
		System.out.println("Area of Rectangle: "+r.area());
		
		Triangle t=(Triangle) s3;
		t.setHeight(10);
		t.setBase(8);
		System.out.println("Area of Triangle: "+t.area());
		
	}

}
