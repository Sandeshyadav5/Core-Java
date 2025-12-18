package com.rays.oops.polymorphism;

public class TestShapeUsingMethodArgument {
	public static void main(String[] args) {
		Shape s[] = new Shape[3];
		s[0]=Shape.getShape(1);
		s[1]=Shape.getShape(2);
		s[2]=Shape.getShape(3);
		
		Circle c = (Circle) s[0];
		c.setRadius(5);
		
		Rectangle r = (Rectangle) s[1];
		r.setLength(55);
		r.setWidth(2);
		 
		Triangle t = (Triangle) s[2];
		t.setHeight(2);
		t.setbase(3);
		getArea(s);
		
	}
	public static void getArea(Shape[] s) {

		for (int i = 0; i < s.length; i++) {
			s[i].area();  

	}



	}}
