package Lec22;

public class Add_Two_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(3, 7));
		System.out.println(add(13, 7, 9));
		System.out.println(add(13, 7, 9.8));
		// System.out.println(add(13, 7.9, 9.8));
		System.out.println(add(2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 2, 12, 23, 2, 2, 33, 3, 4, 6));

	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int add(int a, int b, double c) {
		return (int) (a + b + c);
	}

	public static int add(int x,int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		return sum;
	}
}
