package Lec29;

public class StringBulider_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.append(true);
		sb.append("hey");
		sb.append(1);
		sb.append("ByeOKay1");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.substring(1, 3));
		System.out.println(sb.charAt(1));
		sb.append("ab");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		String s = sb.toString();
	

	}

}
