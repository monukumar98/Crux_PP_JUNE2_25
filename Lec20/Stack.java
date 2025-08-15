package Lec20;

public class Stack {
	protected int[] arr;
	private int idx = -1;

	public Stack() {
		// TODO Auto-generated constructor stub
//		arr=new int [5];
		this(5);
	}

	public Stack(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
	}

	public boolean isEmpty() {
		return idx == -1;
	}

	public int size() {
		return idx + 1;
	}

	public boolean isfull() {
		return size() == arr.length;
	}

	public void push(int item) throws Exception {
		if(isfull()) {
			throw new Exception("Bklol stack full hai");
		}
		arr[++idx] = item;
	}
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Bklol stack empty hai");
		}
		return arr[idx--];
	}

	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Bklol stack empty hai");
		}
		return arr[idx];
	}
	public void Display() {
		for (int i = 0; i <=idx; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}











