package in.co.rays.basic;

public class ReverseSDizit {
	public static void main(String[] ar) {
		int a = 536;
		int ans = 0;
		int quo = a;
		int rem = 0;
		while (quo != 0) {
			rem = quo % 10;
			ans = ans * 10 + rem;
			quo = quo / 10;
		}
		System.out.println(ans);
	}

}
