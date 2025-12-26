package com.rays.collection.method;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestRetainAllMethod {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("Ram");
		c.add("shyam");
		c.add("baman");
		
		Collection c1=new ArrayList();
		c1.add("Ram");
		c1.add("shyam");
		c1.add("bawman");
		c.retainAll(c1);
		System.out.println(c);
	}

}
