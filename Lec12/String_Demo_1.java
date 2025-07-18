package Lec12;

public class String_Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str1 == str2);// address comapre krega
		System.out.println(str1 == str3);
		System.out.println(str4 == str3);
		System.out.println(str1.equals(str2));// content Comapre krega
		int[] arr = new int[6];
		System.out.println(arr.length);
		System.out.println(str1.length());
		System.out.println(str1.charAt(4));

	}

}


