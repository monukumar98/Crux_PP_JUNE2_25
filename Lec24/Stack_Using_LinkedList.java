package Lec24;

import java.util.LinkedList;

public class Stack_Using_LinkedList {
	private LinkedList<Integer> ll = new LinkedList<>();

	public void push(int item) {
		ll.addFirst(item);

	}

	public int pop() {
		return ll.remove();// remove first

	}

	public int peek() {
		return ll.getFirst();
	}

	public int size() {
		return ll.size();
	}

	public void Display() {
		System.out.println(ll);
	}
	public static void main(String[] args) {
		Stack_Using_LinkedList st= new Stack_Using_LinkedList();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.Display();
	}

}
