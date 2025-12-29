package com.rays.collection;

import java.util.Vector;
import java.util.Enumeration;

public class TestEnumeration {
	public static void main(String[] args) {
Vector v=new Vector();
		
		v.add("sandesh");
		v.add("durgesh");
		v.add("Bhaveshh");
		v.add("yadav");
		v.add("Lohiya");
		System.out.println(v);
		v.add("fudfj");
		
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			Object o =e.nextElement();
			System.out.println(o);
			
		}
		System.out.println(v);
	}

}
