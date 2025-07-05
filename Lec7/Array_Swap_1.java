package Lec7;

public class Array_Swap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 5, 7, 8, 9 };
//		int[] arr1 = new int[] { 10, 5, 7, 8, 9 };
		System.out.println(arr[0] + " " + arr[1]);// 10 5
		swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);// ??
	}

	public static void swap(int a, int b) {
		// TODO Auto-generated method stub
		int temp = a;
		a = b;
		b = temp;

	}

}
