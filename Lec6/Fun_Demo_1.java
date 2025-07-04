package Lec6;

public class Fun_Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		add();
		System.out.println("Bye");

	}

	public static void add() {
		int a = 9;
		int b = 7;
		int c = a + b;
		sub();
		System.out.println(c);// 16
	}

	public static void sub() {
		int a = 9;
		int b = 7;
		int c = a - b;
		System.out.println(c);// 2
	}
}
