package Lec1;

public class Inc_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 8;
////		x++;// x = x+1;
////		x--; // x=x-1;
////		++x;// x = x+1;
////		--x; // x=x-1;
//		System.out.println(x++);
//		System.out.println(x);
//		int y = 19;
//		System.out.println(--y);
//		System.out.println(y);
		int c = x++ - ++x + --x + x-- - --x + --x;
		System.out.println(c);

	}

}
