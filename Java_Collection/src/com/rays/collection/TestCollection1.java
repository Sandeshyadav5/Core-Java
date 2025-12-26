package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection1 {
	public static void main(String[] args) {
		
		Collection c1= new ArrayList();
		c1.add("Bura mat dekho ");
		c1.add("bura mat suno");
		c1.add("bura mat bolo");
		
		System.out.println("Length of Collection:"+c1.size());
		
		for (Object ele:c1) {
			System.out.println(ele);
		}
		Object[] oArray =c1.toArray();
		for (Object ele:oArray) {
			String s=(String)ele;
			System.out.println(s);
		}
	}

}
