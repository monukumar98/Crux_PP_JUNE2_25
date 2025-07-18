package Lec12;

public class String_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";// String pool
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		s1 = s1 + "bye";
		String s5 = "Hello" + "Bye";// String pool
	}

}
