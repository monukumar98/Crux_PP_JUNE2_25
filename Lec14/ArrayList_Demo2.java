package Lec14;

import java.util.ArrayList;

public class ArrayList_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();// 10
		ll.add(10);
		ll.add(20);
		ll.add(7);
		ll.add(11);
		ll.add(21);
		ll.add(71);
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(-6);
		System.out.println(ll.size());
		System.out.println(ll);
		ArrayList<Integer> ll1 = new ArrayList<>();// 10
		ll1.add(-9);
		ll1.add(-2);
		for (int i = 0; i < ll1.size(); i++) {
			ll.add(ll1.get(i));

		}

		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}

		System.out.println();

	}

}
