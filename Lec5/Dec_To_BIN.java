package Lec5;

public class Dec_To_BIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 300;
		int sum = 0;
		int mul = 1;
		while (n > 0) {
			int rem = n % 2;
			sum = sum + rem * mul;
			mul = mul * 10;
			n = n / 2;
		}
		System.out.println(sum);
	}

}
