package in.co.rays.string;

public class TestCountSingleChar {
	public static void main(String[] args) {
		String str="sandesh lohiya";
		int count=0;
		for(int j=0; j<str.length(); j++) {
			if('i'==str.charAt(j)) {
				count++;
				System.out.println(str.charAt(1));
			}
		}
		System.out.println("------------------------");
		if (count>0) {
			System.out.println("count"+count);
		}
	}

}
