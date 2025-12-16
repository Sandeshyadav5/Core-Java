package com.rays.oops.inheritance;

public class TestShape {
	public static void main(String[] args) {
		System.out.println("---------circle-----------");
		Circle c=new Circle();
		
		c.setColor("blue");
		c.setBorderWitdth(23);
		c.setRadius(23);
		
		System.out.println("Color of Circle is =   "+c.getColor());
		System.out.println("Border width of circle of =   "+c.getBorderWitdth());
		System.out.println("Radius of circle is =   "+c.getRadius());
		System.out.println("area of ccircle is =   "+c.area());
		
		System.out.println("-------rectangle-----------");
		
		Rectangle r=new Rectangle();
		
		r.setLength(56);
		r.setWidth(89);
		
		System.out.println("Length of Rectangle is  =   "+r.getLength());
		System.out.println("Width of recctangle is  =   "+r.getWidth());
		System.out.println("Area of Recctangle is  =   "+r.area());
		
		System.out.println("------Triangle-------");
		
		Triangle t=new Triangle();
		t.setBase(7);
		t.setHeight(8);
		
		System.out.println("Base of Triangle  =  "+t.getBase());
		System.out.println("height of Triangle  =  "+t.getHeight());
		System.out.println("Area of triangle is  =  "+t.area());
	}

}
