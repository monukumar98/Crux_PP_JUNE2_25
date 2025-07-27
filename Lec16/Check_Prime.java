package Lec16;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 17;
	}
	public static boolean is_Prime(int n) {
		int i=2;
		while(i*i<=n) {
			if(n%i==0) {
				return false;
			}
			i++;
		}
		return true;
	}

}
