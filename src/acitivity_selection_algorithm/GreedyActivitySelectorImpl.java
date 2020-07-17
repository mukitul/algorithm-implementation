package acitivity_selection_algorithm;

public class GreedyActivitySelectorImpl {

	static class Solution {
		Solution() {

		}

		void greedyActivitySelector(int[] s, int[] f) {
			int k = 0;
			System.out.println(k + " ");
			for (int i = 1; i < s.length; i++) {
				if (s[i] >= f[k]) {
					k = i;
					System.out.println(k + " ");
				}
			}

		}
	}

	public static void main(String[] args) {

		int[] starTime = { 1, 3, 0, 5, 3, 5, 6, 8, 8, 2, 12 };
		int[] finishTime = { 4, 5, 6, 7, 9, 9, 10, 11, 12, 14, 16 };

		// sort starTime and finishTime according to finishTime
		Solution sln = new Solution();
		sln.greedyActivitySelector(starTime, finishTime);
	}

}
