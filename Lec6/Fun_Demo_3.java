package Lec6;

public class Fun_Demo_3 {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int a = 8;
		int b = 7;
//		int c=add(a, b);
//		System.out.println(c);
		System.out.println(val);// 100
		System.out.println(add(a, b));
		System.out.println(val);// ??
		System.out.println("Bye");
	}

	public static int add(int a, int b) {

		int c = a + b;
		// if (c > 15) {
		int val = 70;
		// val = val - 5;
		Fun_Demo_3.val = Fun_Demo_3.val - 5;
		return c + sub(c, b);
		// }

	}

	public static int sub(int a, int b) {

		int c = a - b;
		return c;

	}

}
