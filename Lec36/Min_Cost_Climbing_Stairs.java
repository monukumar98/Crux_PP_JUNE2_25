package Lec36;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cost = { 10, 15, 20 };
		
		int zero=Min_Cost(cost, 0);
		int one=Min_Cost(cost, 1);
		System.out.println(Math.min(zero, one));
	}

	public static int Min_Cost(int[] cost, int i) {
		if (i >= cost.length) {
			return 0;
		}
		int f = Min_Cost(cost, i + 1);
		int s = Min_Cost(cost, i + 2);
		return cost[i] + Math.min(f, s);

	}
}
