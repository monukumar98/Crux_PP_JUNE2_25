package Lec12;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "81615";
		printSubString(s);
	}

	public static void printSubString(String s) {
		int c = 0;
		boolean [] visited = new boolean[s.length()];// false
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				String str = s.substring(i, j);// iska mtlb  i to j-1 tk char
				long num = Long.parseLong(str);
				if (Is_CB_Numbers(num)&& isvisited(visited,i,j)) {
					c++;// cb number count kra
					// i to j-1 tk char use nhi krna hai 
					for(int k=i; k<j; k++) {
						visited[k]=true;
					}
				}

			}
		}
		System.out.println(c);
	}

	public static boolean isvisited(boolean[] visited, int i, int j) {
		// TODO Auto-generated method stub
		for(;i<j; i++) {
			if(visited[i]==true) {
				return false;
			}
		}
		return true;

	}

	public static boolean Is_CB_Numbers(long num) {
		if (num == 0 || num == 1) {
			return false;
		}
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (num % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}
}
