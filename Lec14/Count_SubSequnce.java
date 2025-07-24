package Lec14;

public class Count_SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		System.out.println("\n"+Count_Sub(ques, ""));
		// System.out.println(count);

	}

	public static int Count_Sub(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		char ch = ques.charAt(0);
		int x = Count_Sub(ques.substring(1), ans);
		int y = Count_Sub(ques.substring(1), ans + ch);
		return x+y;
	}

//	static int count = 0;
//
//	public static void print(String ques, String ans) {
//		if (ques.length() == 0) {
//			System.out.println(ans);
//			count++;
//			return;
//		}
//		char ch = ques.charAt(0);
//		print(ques.substring(1), ans);
//		print(ques.substring(1), ans + ch);
//	}

}
