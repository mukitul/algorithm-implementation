package single_source_shortest_path;

public class BellManFordImpl {

	static class Solution{
		int vertex;
		int mat[][];
		int w[][];
		int path[];
		int cost[];
		
		Solution(int n){
			vertex = n;
			mat = new int[vertex][vertex];
			w = new int[vertex][vertex];
			path = new int[vertex];
			cost = new int[vertex];
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
		
		
		boolean BellmanFord(int source) {
			initializeSingleSource(source);
			for(int i=0;i<vertex-1;i++) {
				for(int j=0;j<vertex;j++) {
					for(int k=0;k<vertex;k++) {
						if(mat[j][k]==1) {
							relax(j,k);
						}
					}
				}
			}


			for(int j=0;j<vertex;j++) {
				for(int k=0;k<vertex;k++) {
					if(mat[j][k]==1) {
						if(cost[k]>cost[j]+w[j][k]) {
							return false;
						}
					}
				}
			}

			return true;
		}
		
		
		void getPath(int index) {

			if(path[index]==0) {
				System.out.print(path[index]+" ");
				return;
			}

			getPath(path[index]);
			System.out.print(path[index]+" ");
		}

		void printSolution(int source) {
			for(int i=0;i<vertex;i++) {
				if(i!=source) {
					getPath(i);
					System.out.print(i+"\t Cost:"+cost[i]);
					System.out.println();
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		int v=5;
		Solution b = new Solution(v);
		b.addEdge(0, 1, 6);
		b.addEdge(0, 3, 7);
		b.addEdge(1, 3, 8);
		b.addEdge(1, 2, 5);
		b.addEdge(2, 1, -2);
		b.addEdge(1, 4, -4);
		b.addEdge(3, 4, 9);
		b.addEdge(3, 2, -3);
		b.addEdge(4, 2, 7);
		b.addEdge(4, 0, 2);

		if(b.BellmanFord(0)) {
			b.printSolution(0);
		}else {
			System.out.println("NO Solution");
		}
	}

}
