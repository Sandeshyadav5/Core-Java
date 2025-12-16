package in.co.rays.basic;

public class TestString {
	public static void main(String[] args) {
		String name= "Sandesh Yadav";
		System.out.println("String length :"+name.length());
		System.out.println(name.charAt(5));
		System.out.println(name.indexOf("d"));
		System.out.println(name.lastIndexOf("Y"));
		System.out.println(name.replace("S", "Y"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.startsWith("Sandesh"));
		System.out.println(name.endsWith("Yadav"));
		System.out.println(name.substring(12));
		System.out.println(name);
	}

}
