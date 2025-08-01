package Lec16;

public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 4, 3 };
		int amount = 10;
		Combination(coin, amount, "", 0);
	}

	public static void Combination(int[] coin, int amount, String ans, int idx) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = idx; i < coin.length; i++) {
			if (amount >= coin[i]) {
				Combination(coin, amount - coin[i], ans + coin[i], i);
			}
		}
	}

}
