package Lec12;

public class lexicographical_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "kunal";
		String s2 = "komal";
		System.out.println(s1.compareTo(s2));// +ve s1>s2| -ve s1<s2 | 0 s1==s2 hais
		String s3 = "ankit";
		String s4 = "ankita";
		System.out.println(s3.compareTo(s4));
	}

	public static int lexicographical(String s1, String s2) {
		if (s1 == s2) {
			return 0;
		}
		int min=Math.min(s1.length(), s2.length());
		for (int i = 0; i <min; i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return s1.charAt(i)-s2.charAt(i);
			}	
		}
		return s1.length()-s2.length();
	}
}
