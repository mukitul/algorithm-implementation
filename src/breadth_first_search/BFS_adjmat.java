package breadth_first_search;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_adjmat {

	static class BFSTraversal {
		int vertex;
		boolean visited[];
		int mat[][];

		public BFSTraversal(int v) {
			vertex = v;
			mat = new int[vertex][vertex];
			visited = new boolean[vertex];
		}

		void addEdge(int u, int v) {
			mat[u][v] = 1;
		}

		void BFS(int s) {
			Queue<Integer> q = new LinkedList<>();
			q.add(s);

			while (q.size() > 0) {
				int a = q.peek();
				System.out.println(a);
				visited[a] = true;
				q.poll();
				for (int i = 0; i < vertex; i++) {
					if (mat[a][i] == 1 && !visited[i]) {
						q.add(i);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int v = 6;
		BFSTraversal bfst = new BFSTraversal(v);
		bfst.addEdge(0, 1);
		bfst.addEdge(0, 2);
		bfst.addEdge(1, 3);
		bfst.addEdge(2, 4);
		bfst.addEdge(2, 5);
		
		bfst.BFS(0);
	}

}
