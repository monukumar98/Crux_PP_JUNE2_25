package Lec28;

public interface StackI {
	public static final int x = 9;

	public void push(int item);

	public int pop();

	// java 8
	public static int get() {
		return 0;
	}

	default int get2() {
		return 0;
	}
	// java 9
	private void fun() {
		
	}

//	public int peek() {
//		
//	}

}





