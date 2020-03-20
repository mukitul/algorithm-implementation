using System;
					
public class Program{
	public class DFS {
		bool[] visited;
		int vertex;
		int[,] mat;
		
		public DFS(int v) {
			vertex = v;
			mat = new int[vertex,vertex];
			visited = new bool[vertex];
		}
		
		public void addEdge(int u, int v){
			mat[u,v]=1;
		}
		
		public void dfs(int v){
			Console.WriteLine(v);
			visited[v]=true;
			for(int i=0;i<vertex;i++){
				if(mat[v,i]==1 && !visited[i]){
					dfs(i);
				}
			}
		}

	}
	public static void Main()
	{
		int vertex = 4;
		DFS d = new DFS(vertex);
		d.addEdge(0, 1);
		d.addEdge(0, 2);
		d.addEdge(2, 0);
		d.addEdge(1, 2);
		d.addEdge(2, 3);
		d.addEdge(3, 3);
		d.dfs(2);
	}
}