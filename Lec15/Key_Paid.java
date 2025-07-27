package Lec15;

import java.util.*;

public class Key_Paid {
	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "237";
		List<String> ll = new ArrayList<>();
		Letter_Combinations(ques, "", ll);
		System.out.println(ll);

	}

	public static void Letter_Combinations(String ques, String ans, List<String> ll) {// 237
		if (ques.length() == 0) {
			// System.out.println(ans);
			ll.add(ans);
			return;
		}
		char ch = ques.charAt(0);// '2'
		String press = key[ch - 48];// abc
		for (int i = 0; i < press.length(); i++) {
			Letter_Combinations(ques.substring(1), ans + press.charAt(i), ll);
		}

	}
}
