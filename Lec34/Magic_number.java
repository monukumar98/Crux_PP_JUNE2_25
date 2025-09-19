package Lec34;

public class Magic_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
		System.out.println(NthNumber(n));

	}

	public static int NthNumber(int n) {
		int ans = 0;
		int mul = 5;
		while (n > 0) {
			if ((n & 1) != 0) {
				ans += mul;
			}
			mul = mul * 5;
			n >>= 1;
		}
		return ans;
	}

}
