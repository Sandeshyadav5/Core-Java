package com.rays.oops.interfaces;

public class Buisnessmen extends Person implements Richman,SocialWorker {

	@Override
	public void helpToOthers() {
		System.out.println("help otheras");
		
	}

	@Override
	public void earnmoney() {
	System.out.println("earn more money");
		
	}

	@Override
	public void party() {
		System.out.println("lets go for party");
		
	}

	@Override
	public void donation() {
	 System.out.println("donate some money");
		
	}
	

}
