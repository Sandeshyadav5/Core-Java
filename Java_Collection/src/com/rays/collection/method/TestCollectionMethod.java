package com.rays.collection.method;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethod {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		
		c.add("Ram");
		c.add(5);
		c.add(5.3);
		c.add('a');
		c.add(true);
		
		System.out.println("c :"+c);
		System.out.println("c size:"+c.size());
		System.out.println("---------------");
		
		Collection c1 =new ArrayList();
		
		c1.add("sita");
		c1.add(4);
		c1.add(3.4);
		c1.add('j');
		c1.add(false);
		
		System.out.println("c1 :"+c1);
		System.out.println("c1 size :"+c1.size());
		
		System.out.println("---------------");
		System.out.println(c.containsAll(c1));
		c.addAll(c1);
		System.out.println(c.containsAll(c1));
		System.out.println("c after addall c:"+c);
		c.removeAll(c1);
		System.out.println("c after removeAll c1:"+c);
		System.out.println("c is empty: "+c.isEmpty());
		c.clear();
		System.out.println("c is empty: "+c.isEmpty());
		
	}

}
