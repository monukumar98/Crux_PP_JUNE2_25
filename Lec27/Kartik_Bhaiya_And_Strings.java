package Lec27;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abaaaabababaaa";
		int k = 2;
		int flipa = maximum_length(str, k, 'a');
		int flipb = maximum_length(str, k, 'b');
		System.out.println(Math.max(flipa, flipb));

	}

	public static int maximum_length(String s, int k, char ch) {

		int si = 0, ei = 0,flip=0,ans=0;
		while (ei < s.length()) {
			// grow
			if(s.charAt(ei)==ch) {
				flip++;
			}
			// shrink
			while(flip>k && si<=ei) {
				if(s.charAt(si)==ch) {
					flip--;
				}
				si++;
			}
			// ans calculate
			ans=Math.max(ans, ei-si+1);
			ei++;
		}
		return ans;

	}
}








