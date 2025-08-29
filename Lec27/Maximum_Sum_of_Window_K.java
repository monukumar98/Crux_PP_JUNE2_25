package Lec27;

public class Maximum_Sum_of_Window_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 1, 3, 5, 6, 3, 2, 3, 1 };
		int k = 3;

	}

	public static int Maximum_Sum(int[] arr, int k) {
		// 1. 1st step 1st ka window ka ans calculate krna hai
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		int ans = sum;
		// 1. 2nd Step  window grow shrink krna hai 
		for (int i = k; i < arr.length; i++) {
			// 1. grow
			sum=sum+arr[i];
			// 2. shrink
			sum=sum-arr[i-k];
			// 3. ans calculate
			ans=Math.max(ans, sum);
		}
		return ans;

	}
}





