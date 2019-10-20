package knapsack;

public class ZeroOneKnapsack {

	static class Solution{
		Solution(){
			
		}
		
		int[][] maxResult(int[] profit, int[] weight, int m, int n){
			int[][] res=new int[n+1][m+1];
			
			for(int i=0;i<=n;i++) {
				for(int j=0;j<=m;j++) {
					if(i==0||j==0) res[i][j]=0;
					
					else if(weight[i]<=j) {
						res[i][j] = Math.max((profit[i]+res[i-1][j-weight[i]]), res[i-1][j]);
					}else {
						res[i][j]=res[i-1][j];
					}
				}
			}
			
			return res;
		}
	}
	public static void main(String[] args) {
		int[] profit = {0,1,2,5,6};
		int[] weight = {0,2,3,4,5};
		int m=8, n=4;
		
		Solution sln = new Solution();
		int[][] res = sln.maxResult(profit, weight, m, n);
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		
		int i=n, j=m;
		while(i>0 && j>0) {
			if(res[i][j]==res[i-1][j]) {
				System.out.print(i+":0 ");
				i--;
			}else {
				System.out.print(i+":1 ");
				i--;
				j=j-weight[i];
			}
		}
		
	}

}
