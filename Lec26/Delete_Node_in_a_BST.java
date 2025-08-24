package Lec26;

import Lec26.BinarySearchTree.Node;

public class Delete_Node_in_a_BST {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public TreeNode deleteNode(TreeNode root, int key) {
			if (root == null) {
				return null;
			}
			if (root.val < key) {
				root.right = deleteNode(root.right, key);
			} else if (root.val > key) {
				root.left = deleteNode(root.left, key);
			} else {// data match kra hai delete krna hai ab
				if(root.left==null) {
					return root.right;
				}
				else if(root.right==null) {
					return root.left;
				}
				else {
					int max=max(root.left);// 6
					root.left=deleteNode(root.left, max);
					root.val=max;
;					
				}

			}
			return root;

		}
		public int max(TreeNode nn) {
			if(nn==null) {
				return Integer.MIN_VALUE;
			}
			int r =max(nn.right);
			return Math.max(r, nn.val);

		}
	}
}
