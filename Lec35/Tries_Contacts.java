package Lec35;

import java.util.HashMap;
import java.util.Scanner;

public class Tries_Contacts {
	class Node {
		char ch;
		HashMap<Character, Node> child = new HashMap<>();
		boolean isTerminal;
		int count = 1;

		public Node(char ch) {
			// TODO Auto-generated constructor stub
			this.ch = ch;
		}
	}

	private Node root;

	public Tries_Contacts() {
		// TODO Auto-generated constructor stub
		root = new Node('*');
	}

	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
				curr.count++;
			} else {
				Node nn = new Node(ch);
				curr.child.put(ch, nn);
				curr = nn;
			}
		}
		curr.isTerminal = true;

	}
	public int find(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return 0;
			}
		}
		return curr.count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tries_Contacts ts = new Tries_Contacts();
		int n = sc.nextInt();
		while (n-- > 0) {
			String s1 = sc.next();
			String s2 = sc.next();
			if(s1.equals("add")) {
				ts.insert(s2);
			}
			else {
				System.out.println(ts.find(s2));
			}
		}
	}

}
