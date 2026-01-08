package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestListSorting {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("sandesh");
		a.add("yadav");
		a.add("durgeshh");
		a.add("ahhir");
		a.add("lohiya");
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		Collections.shuffle(a);
		System.out.println(a);
		
	}

}
