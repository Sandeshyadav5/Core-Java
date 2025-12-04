package in.co.rays.basic;

public class Divisible7 {
	public static void main(String[] a) {
		int k = 0;
		for (int i = 100; i <= 200; i++) {

			if (i % 7 == 0) {
				k = k + i;
			}
		}
		System.out.println(k);
	}

}
