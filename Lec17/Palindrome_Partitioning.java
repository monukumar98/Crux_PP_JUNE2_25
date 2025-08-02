package Lec17;

import java.util.*;

public class Palindrome_Partitioning {
	public static void main(String[] args) {
		String ques = "nitin";
		List<List<String>> ans = new ArrayList<>();
 		List<String> ll = new ArrayList<>();
		Partition(ques, ll,ans);
		System.out.println(ans);
	}

	public static void Partition(String ques, List<String> ll,List<List<String>> ans ) {
		if (ques.length() == 0) {
			//System.out.println(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String s = ques.substring(0, i);
			if (isPalindrom(s)) {
				ll.add(s);
				Partition(ques.substring(i),ll,ans);
				ll.remove(ll.size()-1);
			}
		}
	}

	public static boolean isPalindrom(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
