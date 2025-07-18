package Lec12;

public class Check_Palindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "nitin";
		System.out.println(isPalindrom(s1));
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

//		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
//			if (s.charAt(i) != s.charAt(j)) {
//				return false;
//			}
//
//		}
//		return true;

	}
}
