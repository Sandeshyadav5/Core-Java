package com.rays.oops.abstracction;

public class TestAnimal {
	public static void main(String[] args) {
		Animal a1= new Cat();
		Animal a2=new Dog();
		
		Cat c=(Cat) a1;
		System.out.println(c.voice());
		
		Dog d=(Dog) a2;
		System.out.println(d.voice());
	}

}
