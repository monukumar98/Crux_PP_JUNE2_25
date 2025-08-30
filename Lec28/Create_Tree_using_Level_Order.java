package Lec28;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Create_Tree_using_Level_Order {

	class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
	}

	private Node root;

	public Create_Tree_using_Level_Order() {
		// TODO Auto-generated constructor stub
		createTree();
	}

	private void createTree() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue<Node> q = new LinkedList<>();
		int item =sc.nextInt();
		Node nn = new Node(item);
		root=nn;
		q.add(nn);
		while(!q.isEmpty()) {
			Node n=q.poll();
			int c1=sc.nextInt();
			int c2=sc.nextInt();
			if(c1!=-1) {
				Node node = new Node(c1);
				n.left=node;
				q.add(node);
				
			}
			if(c2!=-1) {
				Node node = new Node(c2);
				n.right=node;
				q.add(node);
			}
		}
		
	}

}









