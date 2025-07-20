package Lec13;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fac(n));

	}

	public static int fac(int n) {
		if (n == 0) {
			return 1;
		}

		int f1 = fac(n - 1);// SP
		return f1 * n;

	}
}
