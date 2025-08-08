package Lec20;

import java.util.Stack;

public class Stack_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		//ArrayList<Integer> ll = new ArrayList<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st);
		System.out.println(st.peek());// get 
		System.out.println(st.pop());// remove
		System.out.println(st.size());
		System.out.println(st.capacity());
		for(int x:st) {
			System.out.print(x+" ");
		}
		System.out.println();
		
	}

}
