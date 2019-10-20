package single_source_shortest_path;

public class DijkstraImpl {

	static class Solution{
		int vertex;
		int mat[][];
		int w[][];
		int path[];
		int cost[];
		boolean visited[];
		
		Solution(int n){
			vertex = n;
			mat = new int[vertex][vertex];
			w = new int[vertex][vertex];
			path = new int[vertex];
			cost = new int[vertex];
			visited = new boolean[vertex];
		}
		
		void addEdge(int u, int v, int weight) {
			mat[u][v] = 1;
			w[u][v] = weight;
		}

		void initializeSingleSource(int source) {
			for(int i=0;i<vertex;i++) {
				path[i]=0;
				cost[i]=9999;
			}

			cost[source] = 0;
		}

		void relax(int u, int v) {
			if(cost[v]>cost[u]+w[u][v]) {
				cost[v]=cost[u]+w[u][v];
				path[v]=u;
			}
		}
		
		
		int extractMin() {
			int minDis=9999,unvisitedVertex=0;
			for(int i=0;i<vertex;i++) {
				if(!visited[i] && minDis>=cost[i]) {
					unvisitedVertex = i;
					minDis = cost[i];
				}
			}

			return unvisitedVertex;
		}
		
		
		void Dijkstra(int source) {
			initializeSingleSource(source);
			for(int i=0;i<vertex;i++) {
				int u = extractMin();
				visited[u]=true;

				for(int j=0;j<vertex;j++) {
					if(mat[u][j]==1) {
						relax(u, j);
					}

				}
			}
		}
		
		
		void getPath(int index) {
			if(path[index]==0) {
				System.out.print(" "+path[index]);
				return;
			}
			
			getPath(path[index]);
			System.out.print(" "+path[index]);
		}
		
		void printSolution() {
			for(int i=0;i<vertex;i++) {
				getPath(i);
				System.out.print(" "+i+"\tCost: "+cost[i]);
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		int v=5;
		Solution b = new Solution(v);

		b.addEdge(0, 1, 10);
		b.addEdge(0, 3, 5);
		b.addEdge(1, 3, 2);
		b.addEdge(3, 1, 3);
		b.addEdge(1, 2, 1);
		b.addEdge(3, 2, 9);
		b.addEdge(3, 4, 2);
		b.addEdge(4, 2, 6);
		b.addEdge(2, 4, 4);
		b.addEdge(4, 0, 7);
		
		b.Dijkstra(0);
		
		b.printSolution();
	}

}
