package depth_first_search;

public class DFS_adjmat {
	
	static class DFS {
		boolean visited[];
		int vertex;
		int mat[][];

		DFS(int v) {
			vertex = v;
			mat = new int[vertex][vertex];
			visited = new boolean[vertex];
		}
		
		void addEdge(int u, int v){
			mat[u][v]=1;
		}
		
		void dfs(int v){
			System.out.println(v);
			visited[v]=true;
			for(int i=0;i<vertex;i++){
				if(mat[v][i]==1 && !visited[i]){
					dfs(i);
				}
			}
		}

	}

	public static void main(String[] args) {
		int vertex = 5;
		DFS d = new DFS(vertex);
		d.addEdge(0, 1);
		d.addEdge(0, 2);
		d.addEdge(1, 3);
		d.addEdge(1, 4);
	
		d.dfs(0);
		
	}

}
