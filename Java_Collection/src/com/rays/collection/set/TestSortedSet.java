package com.rays.collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {
	public static void main(String[] args) {
		
		SortedSet s=new TreeSet();
		s.add('a');
		s.add('b');
		s.add('d');
		s.add('c');
		System.out.println(s);
	}

}
