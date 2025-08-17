package Lec24;

import java.util.LinkedList;

public class LinkedList_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);// addlast
		ll.addFirst(2);
		ll.addLast(-9);
		ll.add(1, -11);
		System.out.println(ll);
		System.out.println(ll.get(0));
		System.out.println(ll.peek());// always 0th index ki value
		System.out.println(ll.remove());// remove first
//		System.out.println(ll.removeFirst());
//		System.out.println(ll.removeLast());
//		System.out.println(ll.remove(1));
		System.out.println(ll.poll());// // remove first
		System.out.println(ll);
	}

}
