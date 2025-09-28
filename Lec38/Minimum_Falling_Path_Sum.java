package Lec38;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum {
	public static void main(String[] args) {
		int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int ans = Integer.MAX_VALUE;
		Integer [][] dp = new Integer [matrix.length][matrix[0].length];
//		for (int[] a : dp) {
//			Arrays.fill(a,999999);
//		}
		for (int i = 0; i < matrix[0].length; i++) {
			ans = Math.min(Minimum_Falling_Path(matrix, 0, i,dp), ans);
		}
		System.out.println(ans);
	}

	public static int Minimum_Falling_Path(int[][] matrix, int cr, int cc,Integer [][]dp) {
		if (cc < 0 || cc >= matrix[0].length) {
			return Integer.MAX_VALUE;
		}
		if (cr==matrix.length-1) {
			return matrix[cr][cc];
		}
		if(dp[cr][cc]!=null) {
			return dp[cr][cc];
		}
		int ld = Minimum_Falling_Path(matrix, cr + 1, cc - 1,dp);
		int down = Minimum_Falling_Path(matrix, cr + 1, cc,dp);
		int rd = Minimum_Falling_Path(matrix, cr + 1, cc + 1,dp);
		return dp[cr][cc]=Math.min(ld, Math.min(rd, down)) + matrix[cr][cc];
	}
}
