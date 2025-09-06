package Lec30;

import java.util.*;

public class Top_View {

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

		public List<Integer> TopView(TreeNode root) {
			Queue<Pair> q = new LinkedList<>();
			TreeMap<Integer, Integer> map = new TreeMap<>();
			q.add(new Pair(root, 0));
			while (!q.isEmpty()) {
				Pair p = q.poll();
				if (!map.containsKey(p.vt)) {
					map.put(p.vt, p.n.val);
				}
				if (p.n.left != null) {
					q.add(new Pair(p.n.left, p.vt - 1));
				}
				if (p.n.right != null) {
					q.add(new Pair(p.n.right, p.vt + 1));
				}
			}
			List<Integer> ll = new ArrayList<>();
			for (int key : map.keySet()) {
				ll.add(map.get(key));
			}
			return ll;
		}
	}

	class Pair {
		TreeNode n;
		int vt;

		public Pair(TreeNode n, int vt) {
			// TODO Auto-generated constructor stub
			this.n = n;
			this.vt = vt;
		}
	}
}
