package Lec14;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll);
		System.out.println(ll.size());
		// add
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(7);
		ll.add(1, -2);// O(N)
		System.out.println(ll);
		// get
		System.out.println(ll.get(2));
		// remove
		System.out.println(ll.remove(1));
		System.out.println(ll);

		// update
		ll.set(1, -9);
		System.out.println(ll);
		// sort
		Collections.sort(ll);
		System.out.println(ll);

	}

}















