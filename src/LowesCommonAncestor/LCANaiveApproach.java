package LowesCommonAncestor;

public class LCANaiveApproach {
	static class Graph{
		int vertex;
		int mat[][];
		int parent[];
		boolean visited[];
		
		Graph(int v){
			vertex = v;
			mat = new int[vertex][vertex];
			parent = new int[vertex];
			visited = new boolean[vertex];
		}
		
		void addEdge(int u, int v) {
			mat[u][v]=1;
		}
		
		void getParent(int node, int par) {
			if(node == par) return;
			
			if(par==-1) {
				parent[node]=par;
			}
			
			for(int i=0;i<vertex;i++) {
				if(mat[node][i]==1 && i!=par) {
					parent[i]=node;
					getParent(i,node);
				}
			}
		}
		
		int LCA(int n1, int n2, int root) {
			int lca=-1;
			while(true) {
				visited[n1]=true;
				if(n1==root) {
					break;
				}
				n1=parent[n1];
			}
			
			while(true) {
				if(visited[n2]) {
					lca = n2;
					return lca;
				}
				n2=parent[n2];
			}
		}
		
		
		void showParents() {
			for(int i=0;i<parent.length;i++) {
				System.out.println("parent "+i+": "+parent[i]);
			}
		}
	}
	public static void main(String[] args) {
		int v=9;
		Graph g = new Graph(v);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(2, 5);
		g.addEdge(2, 6);
		g.addEdge(2, 7);
		g.addEdge(3, 8);
		
		g.getParent(0, -1);
		g.showParents();
		int lca = g.LCA(1,3,0);
		System.out.println("LCA:"+lca);
		
	}

}
