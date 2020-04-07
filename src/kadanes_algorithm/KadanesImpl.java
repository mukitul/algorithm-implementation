package kadanes_algorithm;

public class KadanesImpl {

	static class Solution {

		int kadane(int[] ar) {
			if (ar.length == 0)
				return -1;

			int max_curr;
			int max_global;
			max_global = max_curr = ar[0];

			for (int i = 1; i < ar.length; i++) {
				max_curr = Math.max(ar[i], max_curr + ar[i]);

				if (max_curr > max_global) {
					max_global = max_curr;
				}
			}

			return max_global;
		}
	}

	public static void main(String[] args) {
		// int[] ar = {0,1,2,3,4,5}; //case-1
		// int[] ar = {0}; //case-2
		// int[] ar = {0,-1}; //case-3
		// int[] ar = {}; //case-4
		// int[] ar = {-1,-5,0,0,-1}; //case-5
		int[] ar = { -1, -5, 25, 0, -1 }; // case-6

		Solution sln = new Solution();

		int res = sln.kadane(ar);
		System.out.println("max sub-array sum:" + res);
	}

}
