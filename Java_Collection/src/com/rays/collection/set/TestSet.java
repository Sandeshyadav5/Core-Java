package com.rays.collection.set;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		 Set s=new HashSet();
		 
		 s.add('a');
		 s.add('a');
		 s.add('b');
		 s.add('c');
		 s.add('f');
		 s.add('e');
		 s.add(null);
		 s.add(null);
		 System.out.println(s);
	}

}
