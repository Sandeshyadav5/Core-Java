package in.co.rays.basic;

public class PrimeOrNot {
	public static void main(String[] args) {
		int num=8;
		int count=0;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				
				count++;
			}
		}
		if(count==0) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not prime");
		}
	}
	

}
