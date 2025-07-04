package Lec6;

public class Fun_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int a = 8;
		int b = 7;
		add(a, b);
		System.out.println("Bye");

	}

	public static void add(int a, int b) {

		int c = a + b;
		sub(c, a);
		System.out.println(c);// 16
	}

	public static void sub(int a, int b) {

		int c = a - b;

		System.out.println(c);// 16
	}
}
