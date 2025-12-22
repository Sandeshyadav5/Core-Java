package com.rays.exception;

public class TestArithmaticUsingTryCatch {
	
		public static void main(String[] args) {
			
			int a=0;
			int b=7;
			try{
				int c=b/a;
			}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			}
			System.out.println("program is finished");
		}

}
