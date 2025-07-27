package Lec15;

public class Is_Char_Present {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ertyuiolkjvcghj";
		int idx = 3;
		System.out.println(Is_Present(str, 'i', idx));

	}

	public static boolean Is_Present(String str, char ch, int idx) {

		for (int i = idx; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				return true;
			}
		}
		return false;

	}

}
