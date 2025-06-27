package Lec5;

import java.util.Scanner;

public class Data_Type_Demo_1 {

	public static void main(String[] args) {
		byte b = 5;
		// byte b1 = (byte)(428); // -84
		byte b1 = (byte) (300);
		short s = 10;
		int i = 19;
		long l = 10;
		System.out.println(b1);
		i = b;
		long ll = (4356789013657658l);
		i = (int) (ll);
		System.out.println(i);
		Scanner sc = new Scanner(System.in);
		b=sc.nextByte();
		i=sc.nextInt();
		s=sc.nextShort();
		l=sc.nextLong();
	}
}













