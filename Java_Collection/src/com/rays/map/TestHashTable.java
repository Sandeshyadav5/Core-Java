package com.rays.map;


import java.util.Hashtable;
import java.util.Map;

public class TestHashTable {
	public static void main(String[] args) {
Map m=new Hashtable();
		
		m.put(1, "one");
		m.put(2, "two");
		m.put(3, "three");
		m.put(4, "four");
		m.put(5, "five");
		System.out.println(m);
		System.out.println(m.get(2));
		System.out.println(m.containsKey(1));
		System.out.println(m.containsValue("three"));
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		System.out.println(m.remove(1));
		System.out.println(m);
		m.clear();
		System.out.println(m);
	}

}
