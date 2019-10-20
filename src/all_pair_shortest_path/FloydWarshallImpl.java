package all_pair_shortest_path;

import java.util.Scanner;

public class FloydWarshallImpl {

	static class Solution{
		int vertex;
		int mat[][];
		int wt[][];
		Solution(int n){
			vertex=n;
			mat=new int[vertex][vertex];
			wt=new int[vertex][vertex];
		}
		
		void initialize() {
			for(int i=0;i<vertex;i++) {
				for(int j=0;j<vertex;j++) {
					wt[i][j]=9999;
				}
			}
		}
		void addEdge(int u,int v,int w) {
			wt[u][u]=0;
			wt[u][v]=w;
		}
		
		int[][] floydWarshall(){
			int[][] d = new int[vertex][vertex];
			for(int i=0;i<vertex;i++) {
				for(int j=0;j<vertex;j++) {
					d[i][j]=wt[i][j];
				}
			}
			
			for(int k=0;k<vertex;k++) {
				for(int i=0;i<vertex;i++) {
					for(int j=0;j<vertex;j++) {
						if(d[i][k]+d[k][j]<d[i][j]) {
							d[i][j] = d[i][k]+d[k][j];
						}
					}
				}
			}
			return d;
		}
		
		
		void printSolution(int[][] d) {
			for(int i=0;i<vertex;i++) {
				for(int j=0;j<vertex;j++) {
					System.out.print(wt[i][j]+" ");
				}
				System.out.println();
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t=scn.nextInt();
		for(int i=0;i<t;i++) {
			int v = scn.nextInt();
			int e = scn.nextInt();
			Solution sln = new Solution(v);
			sln.initialize();
			for(int j=0;j<e;j++) {
				int u1 = scn.nextInt();
				int u2 = scn.nextInt();
				int w = scn.nextInt();
				sln.addEdge(u1,u2,w);
			}
			
			int[][] res = sln.floydWarshall();
			sln.printSolution(res);
		}
		scn.close();
	}

}
