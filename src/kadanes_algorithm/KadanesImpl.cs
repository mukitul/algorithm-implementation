using System;
					
public class Program
{
	public static class Solution {

		public static int kadane(int[] ar) {
			if (ar.Length == 0)
				return -1;

			int max_curr;
			int max_global;
			max_global = max_curr = ar[0];

			for (int i = 1; i < ar.Length; i++) {
				max_curr = Math.Max(max_curr, max_curr + ar[i]);

				if (max_curr > max_global) {
					max_global = max_curr;
				}
			}

			return max_global;
		}
	}
	public static void Main()
	{
		// int[] ar = {0,1,2,3,4,5}; //case-1
		// int[] ar = {0}; //case-2
		// int[] ar = {0,-1}; //case-3
		// int[] ar = {}; //case-4
		// int[] ar = {-1,-5,0,0,-1}; //case-5
		int[] ar = { -1, -5, 25, 0, -1 }; // case-6

		

		int res = Solution.kadane(ar);
		Console.WriteLine("max sub-array sum:" + res);
	}
}