package in.co.rays.basic;

public class Pallindrome {
	public static void main(String[] args) {
		int num=123;
		int sum=0;
		int num2=num;
		int r=0;
		while(num2!=0) {
			r=num2%10;
			sum=sum*10+r;
			num2=num2/10;
		}
            System.out.println("reverse no. :" +sum); 
            if(sum==num) {
            	System.out.println("No. is pelindrome");
            }
            else {
            	System.out.println("NO. is not pelindrome");
            }
	}

}
