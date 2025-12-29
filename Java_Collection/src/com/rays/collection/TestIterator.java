package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add("sandesh");
		list.add("durgesh");
		list.add("Bhaveshh");
		list.add("yadav");
		list.add("Lohiya");
		System.out.println(list);
		
		Iterator it=list.iterator();
		while(it.hasNext()) {
			Object o =it.next();
			System.out.println(o);
			it.remove();
		}
		System.out.println(list);
	}

}
