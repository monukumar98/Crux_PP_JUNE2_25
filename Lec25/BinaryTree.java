package Lec25;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

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

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = Create_Tree();
	}

	Scanner sc = new Scanner(System.in);

	private Node Create_Tree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node(item);
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = Create_Tree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = Create_Tree();
		}
		return nn;
	}

	public void Display() {
		Display(root);
	}

	private void Display(Node node) {
		if (node == null) {
			return;
		}
		String s = "<--" + node.val + "-->";
		if (node.left != null) {
			s = node.left.val + s;
		} else {
			s = "." + s;
		}
		if (node.right != null) {
			s = s + node.right.val;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(node.left);
		Display(node.right);
	}

	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		if (nn == null) {
			return Integer.MIN_VALUE;
		}

		int lmax = max(nn.left);
		int rmax = max(nn.right);
		return Math.max(nn.val, Math.max(lmax, rmax));

	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node nn, int item) {
		if (nn == null) {
			return false;
		}
		if (nn.val == item) {
			return true;
		}
		boolean left = find(nn.left, item);
		boolean right = find(nn.right, item);
		return left || right;

	}

	public int ht() {
		return ht(root);
	}

	private int ht(Node node) {
		if (node == null) {
			return 0;
		}

		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh) + 1;

	}

	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}

	private void PreOrder(Node nn) {
		if (nn == null) {
			return;
		}
		System.out.print(nn.val + " ");
		PreOrder(nn.left);
		PreOrder(nn.right);

	}

	public void PostOrder() {
		PostOrder(this.root);
		System.out.println();
	}

	private void PostOrder(Node nn) {
		if (nn == null) {
			return;
		}
		PostOrder(nn.left);
		PostOrder(nn.right);
		System.out.print(nn.val + " ");
	}

	public void INOrder() {
		INOrder(this.root);
		System.out.println();
	}

	private void INOrder(Node nn) {
		if (nn == null) {
			return;
		}
		INOrder(nn.left);
		System.out.print(nn.val + " ");
		INOrder(nn.right);

	}
	public void LevelOrder() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node n=q.poll();
			System.out.println(n.val+" ");
			if(n.left!=null) {
				q.add(n.left);
			}
			if(n.right!=null) {
				q.add(n.right);
			}
		}
		
	}

}












