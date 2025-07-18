package Lec12;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		Integer a1 = 9;
		System.out.println(a);
		System.out.println(a1);
		Long l = 9l;
		int i = a1;// Un-Boxing
		Integer b = a;// auto-Boxing

		Integer c1 = 19;
		Integer c2 = 19;
		Integer c3 = 191;
		Integer c4 = 191;
		System.out.println(c1 == c2);
		System.out.println(c3 == c4);
		Boolean b2 = false;
		Boolean b3 = false;
		System.out.println(b2 == b3);
		Character ch = 'a';
		Character ch1 = 'a';
		System.out.println(ch == ch1);

	}

}
