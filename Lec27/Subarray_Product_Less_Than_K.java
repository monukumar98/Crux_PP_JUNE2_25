package Lec27;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 1, 5 };
		int k = 10;
		System.out.println(Product_Less_Than_K(arr, k));

	}

	public static int Product_Less_Than_K(int[] arr, int k) {
		int ans = 0;
		int p = 1;
		int si = 0, ei = 0;
		while (ei < arr.length) {
			// grow
			p = p * arr[ei];
			// shrink
			while (p >= k && si <= ei) {
				p = p / arr[si];
				si++;
			}
			// ans calculate
			ans = ans + (ei - si + 1);
			ei++;
		}
		return ans;
	}

}
