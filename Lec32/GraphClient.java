package Lec32;

import java.util.HashSet;

public class GraphClient {
	public static void main(String[] args) {
		Graph g = new Graph(7);
		g.AddEdge(1, 4, 3);
		g.AddEdge(1, 2, 4);
		g.AddEdge(3, 2, 2);
		g.AddEdge(3, 4, 1);
		g.AddEdge(5, 4, 6);
		g.AddEdge(5, 6, 2);
		g.AddEdge(5, 7, 4);
		g.AddEdge(6, 7, 2);
		g.Display();
		System.out.println(g.HasPath(1, 6,new HashSet<>()));
		g.printpath(1, 6, new HashSet<>(), "");
		System.out.println(g.BFS(1, 6));
		System.out.println(g.DFS(1, 6));
	}

}


