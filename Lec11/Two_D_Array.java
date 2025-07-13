package Lec11;

public class Two_D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][4];
		System.out.println(arr);
		System.out.println(arr[1]);
		System.out.println(arr[1][2]);
		int[][] other = arr;
		int row = arr.length;
		int col = arr[0].length;
	}

}
