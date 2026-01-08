package com.rays.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TestSortedMap {
	public static void main(String[] args) {
		SortedMap m=new TreeMap();
		m.put(1,'a');
		m.put(5,'b');
		m.put(3,'d');
		m.put(4,'c');
		System.out.println(m);
	}

}
