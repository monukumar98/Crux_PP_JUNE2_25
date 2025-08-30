package Lec28;

public class Pair<T, P> {
	T x;
	P y;

	public Pair() {
		// TODO Auto-generated constructor stub
	}

	public Pair(T x, P y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		Pair<Integer, Long> p1 = new Pair<>();
		Pair<Integer, Character> p2 = new Pair<>();

	}
}
