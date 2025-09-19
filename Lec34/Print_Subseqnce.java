package Lec34;

public class Print_Subseqnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		Subseqnce(s);
	}

	private static void Subseqnce(String s) {
		// TODO Auto-generated method stub
		int n = s.length();
		for (int i = 0; i < (1 << n); i++) {
			pattern(s, i);

		}

	}

	private static void pattern(String s, int i) {
		// TODO Auto-generated method stub
		int pos = 0;
		String ans = "";
		while (i > 0) {
			if ((i & 1) != 0) {
				ans = ans + s.charAt(pos);
			}
			pos++;
			i >>= 1;
		}
		System.out.println(ans);
	}

}
