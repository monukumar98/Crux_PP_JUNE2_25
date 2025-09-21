package Lec36;

import java.util.Arrays;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 7, 9, 3, 1 };
		int[] dp = new int[nums.length];
		Arrays.fill(dp, -1);
//		for (int i = 0; i < dp.length; i++) {
//			dp[i]=-1;
//		}
		/// System.out.println(Robber(nums, 0, dp));
		System.out.println(Robber2(nums, nums.length - 1, dp));
	}

	public static int RobberBU(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		for (int i = 2; i < dp.length; i++) {
			int rob = nums[i] + dp[i - 2];
			int dont_rob = dp[i - 1];
			dp[i] = Math.max(rob, dont_rob);
		}
		return dp[dp.length-1];
	}

	public static int Robber2(int[] nums, int i, int[] dp) {
		if (i < 0) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = nums[i] + Robber2(nums, i - 2, dp);
		int dont_rob = Robber2(nums, i - 1, dp);
		return dp[i] = Math.max(rob, dont_rob);

	}

	public static int Robber(int[] nums, int i, int[] dp) {
		if (i >= nums.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = nums[i] + Robber(nums, i + 2, dp);
		int dont_rob = Robber(nums, i + 1, dp);
		return dp[i] = Math.max(rob, dont_rob);

	}

}
