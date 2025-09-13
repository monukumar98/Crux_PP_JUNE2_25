package Lec32;

import java.util.*;

public class Graph_Valid_Tree {
	class Solution {
		public boolean validTree(int n, int[][] edges) {
			HashMap<Integer, List<Integer>> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(i, new ArrayList<>());
			}
			for (int i = 0; i < edges.length; i++) {
				int a = edges[i][0];
				int b = edges[i][1];
				map.get(a).add(b);
				map.get(b).add(a);
			}
			return DFT(map);
		}

		public boolean DFT(HashMap<Integer, List<Integer>> map) {
			Stack<Integer> st = new Stack<>();
			HashSet<Integer> visited = new HashSet<>();
			int c = 0;
			for (int src : map.keySet()) {
				if (visited.contains(src)) {
					continue;
				}
				c++;
				st.push(src);
				while (!st.isEmpty()) {
					// 1. remove
					int r = st.pop();
					// 2. Ignore if Already visited
					if (visited.contains(r)) {
						return false;
					}
					// 3. Marked visited
					visited.add(r);
					// 4. self work
					// 5. add unvisited nbrs
					for (int nbrs : map.get(r)) {
						if (!visited.contains(nbrs)) {
							st.push(nbrs);
						}
					}
				}
			}
			return c == 1;
		}
	}

}
