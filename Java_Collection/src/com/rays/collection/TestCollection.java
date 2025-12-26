package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		
		Collection c= new ArrayList();
		
		c.add("sandesh");
		c.add(76);
		c.add(1.2);
		c.add('a');
		c.add(true);
		c.add("yadav");
		System.out.println(c);
		System.out.println("-----------------------------");
		
		for (Object o:c) {
			System.out.println(c);
		}
	}

}
