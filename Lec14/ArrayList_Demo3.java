package Lec14;

import java.util.ArrayList;

public class ArrayList_Demo3 {
	public static void main(String[] args) {
		ArrayList<Integer> ll = new ArrayList<>();// 10
		ll.add(10);
		ll.add(20);
		ll.add(7);
		ll.add(11);
		ll.add(21);
		ll.add(71);
		int [] arr = new int [7];
		for(int v:arr) {
			System.out.print(v+" ");
		}
		System.out.println();
		for(int v:ll) {
			System.out.print(v+" ");
		}
	}
}
