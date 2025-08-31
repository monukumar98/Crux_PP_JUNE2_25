package Lec29;

public class StringBulider_VS_String {
	public static void main(String[] args) {
		//  StringTC();
		  StringBuliderTC();

	}

	public static void StringBuliderTC() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 1000000; i++) {
			sb.append(i);
		}
	}

	public static void StringTC() {
		String s = "";
		for (int i = 0; i < 1000000; i++) {
			s = s + i;
		}
	}
}
