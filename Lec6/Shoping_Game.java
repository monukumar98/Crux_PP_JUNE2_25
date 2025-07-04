package Lec6;

import java.util.Scanner;

public class Shoping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int m = sc.nextInt();// Aayush
			int n = sc.nextInt();// Harshit
			Shoping(m, n);
			t--;
		}
	}

	public static void Shoping(int m, int n) {
		// TODO Auto-generated method stub
		int A = 0, H = 0, phone = 1;
		while (true) {
			A = A + phone;
			if (A > m) {
				System.out.println("Harshit");
				return;// break;
			}
			phone++;
			H = H + phone;
			if (H > n) {
				System.out.println("Aayush");
				return;// break;
			}
			phone++;
		}

	}

}
