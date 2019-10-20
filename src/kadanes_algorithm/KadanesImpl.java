package kadanes_algorithm;

public class KadanesImpl {

	static class Solution{
		Solution(){
			
		}
		
		int kadane(int[] ar) {
			if(ar.length==0) return -1;
			int max_curr;
			int max_global;
			max_global = max_curr = ar[0];
			for(int i=1;i<ar.length;i++) {
				max_curr = Math.max(max_curr, max_curr+ar[i]);
				
				if(max_curr>max_global) {
					max_global = max_curr;
				}
			}
			
			return max_global;
		}
	}
	public static void main(String[] args) {
		//int[] ar = {0,1,2,3,4,5};
		//int[] ar = {0};
		//int[] ar = {0,-1};
		//int[] ar = {};
		//int[] ar = {-1,-5,0,0,-1};
		int[] ar = {-1,-5,25,0,-1};
		Solution sln = new Solution();
		int res = sln.kadane(ar);
		System.out.println("max sub-array sum:"+res);
	}

}
