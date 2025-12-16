package in.co.rays.basic;

public class StringAndStringBuffer {
	public static void main(String[] args) {
		String s="Sandesh";
		System.out.println(s);
		System.out.println(s.replace("S", "w"));
		System.out.println(s);
		
		StringBuffer sb=new StringBuffer("Durgesh");
		System.out.println(sb);
		System.out.println(sb.append("yadav"));
		System.out.println(sb);
	}

}
