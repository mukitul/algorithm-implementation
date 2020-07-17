package knapsack;

public class GreedyKnapsack {

	static class Solution {
		int item;
		int maxWeight;
		double x[];

		Solution(int n, int m) {
			item = n;
			maxWeight = m;
			x = new double[n];
		}

		double[] greedyKanpsack(int[] w) {

			double currWeight = maxWeight;
			int i;
			for (i = 0; i < item; i++) {
				if (currWeight - w[i] >= 0) {
					x[i] = 1.0;
					currWeight = currWeight - w[i];
				} else {
					x[i] = currWeight / w[i];
					currWeight = currWeight - x[i];
					break;
				}

			}

			return x;
		}

	}

	public static void main(String[] args) {

		int item = 3;
		int maxWeight = 20;
		int[] weight = { 18, 15, 10 };
		int[] profit = { 25, 24, 15 };

		for (int i = 0; i < item; i++) {
			for (int j = 0; j < item; j++) {
				double p = (double) profit[i] / (double) weight[i];
				double q = (double) profit[j] / (double) weight[j];

				if (p >= q) {
					int tmpW = weight[i];
					weight[i] = weight[j];
					weight[j] = tmpW;

					int tmpP = profit[i];
					profit[i] = profit[j];
					profit[j] = tmpP;
				}
			}
		}
		Solution sln = new Solution(item, maxWeight);
		double[] res = sln.greedyKanpsack(weight);
		double r = 0.0;
		for (int i = 0; i < item; i++) {
			System.out.print(res[i] + " ");
			r = r + (res[i] * profit[i]);
		}
		System.out.println("max profit:" + r);
	}

}
