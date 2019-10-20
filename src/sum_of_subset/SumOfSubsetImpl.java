package sum_of_subset;

public class SumOfSubsetImpl {
	static class Solution{
		
		int[] x;
	
		Solution(){
			x=new int[4];
		}
		
		void SumOfSub(int currSum, int k, int totalSum, int m, int[] s) {
			x[k]=1;
			if(currSum+s[k]==m) {
				for(int i=0;i<k;i++) {
					System.out.print(x[i]+" ");
				}
			}else if(currSum+s[k]+s[k+1]<=m) {
				SumOfSub(currSum+s[k], k+1, totalSum-s[k], m, s);
			}
			
			if(currSum+totalSum-s[k]>=m && currSum+s[k+1]<=m) {
				x[k]=0;
				SumOfSub(currSum, k+1, totalSum-s[k], m, s);
			}
		}
		
	}
	public static void main(String[] args) {
		int[] s = {11,13,24,7};
		int m=31;
		Solution sln = new Solution();
		sln.SumOfSub(0, 0, 55, m, s);
	}

}
