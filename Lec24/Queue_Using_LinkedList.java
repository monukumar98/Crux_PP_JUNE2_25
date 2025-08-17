package Lec24;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Using_LinkedList {
	public static void main(String[] args) {
//		LinkedList<Integer> ll = new LinkedList<>();
//		ll.add(10);
//		ll.add(20);
//		ll.add(30);
//		System.out.println(ll.remove());

		Queue<Integer> q = new LinkedList<>();
		q.add(10);// add last
		q.add(20);
		q.add(30);
		System.out.println(q.poll());// remove first
		System.out.println(q.peek());// get first

	}

}
