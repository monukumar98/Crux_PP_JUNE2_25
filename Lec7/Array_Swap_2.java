package Lec7;

public class Array_Swap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 5, 7, 8, 9 };
//		int[] arr1 = new int[] { 10, 5, 7, 8, 9 };
		System.out.println(arr[0] + " " + arr[1]);// 10 5
		swap(arr, 0, 1);
		System.out.println(arr[0] + " " + arr[1]);// ??
	}

	public static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
