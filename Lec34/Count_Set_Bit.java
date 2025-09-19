package Lec34;

public class Count_Set_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		System.out.println(Count_SetBit(n));
		System.out.println(fast_Count_SetBit(n));
	}

	public static int fast_Count_SetBit(int n) {
		int c = 0;
		while (n > 0) {
			c++;
			n = (n & (n - 1));
		}
		return c;
	}

	public static int Count_SetBit(int n) {
		int c = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				c++;
			}
			n >>= 1;// n=n>>1;
		}
		return c;
	}
}
