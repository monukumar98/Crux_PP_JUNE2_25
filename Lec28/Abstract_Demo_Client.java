package Lec28;

public class Abstract_Demo_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Abstract_Demo ab = new Abstract_Demo();
//		ab.fun();
		Abstract_Demo2 ab = new Abstract_Demo2();
		ab.fun();
		ab.get();
		ab.add();
		Abstract_Demo ab1 = new Abstract_Demo() {
			@Override
			public void fun() {
				
			}
		};
		Abstract_Demo ab2 = new Abstract_Demo() {
			@Override
			public void fun() {
				
			}
		};
	}

}
