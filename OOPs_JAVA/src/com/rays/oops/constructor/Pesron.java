package com.rays.oops.constructor;

public class Pesron {
	private String name;
	private String address;
	private int salary;
	
	public Pesron() {
		System.out.println("default cconstructor");
	}
	public Pesron(String name) {
		this();
		this.name=name;
		System.out.println("name  : "+this.name);
	}
	public Pesron(String name,String address) {
		this(name);
		
		this.address=address;
		System.out.println("address  : "+this.address);
		
	}
	public Pesron(String name,String address,int salary) {
		this(name,address);
		this.salary=salary;
		System.out.println("salary  : "+this.salary);
		
	}

}
