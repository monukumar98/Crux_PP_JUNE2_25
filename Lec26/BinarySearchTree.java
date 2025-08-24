package Lec26;

public class BinarySearchTree {
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

	public BinarySearchTree(int[] in) {
		// TODO Auto-generated constructor stub
		root = CreateTree(in, 0, in.length - 1);
	}

	private Node CreateTree(int[] in, int i, int j) {
		// TODO Auto-generated method stub
		if (i > j) {
			return null;
		}
		int mid = (i + j) / 2;
		Node nn = new Node(in[mid]);
		nn.left = CreateTree(in, i, mid - 1);
		nn.right = CreateTree(in, mid + 1, j);
		return nn;
	}

	public int max(Node nn) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int r =max(nn.right);
		return Math.max(r, root.val);

	}
}









