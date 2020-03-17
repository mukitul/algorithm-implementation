package main

import "fmt"

func max(int a, int b) int{
	if a>b {
		return a;
	}
	return b;
}

func kadane(ar []int, int size) int {
	var i int;
	var max_curr int;
	var max_glo int;
	max_curr = ar[0];
	max_glo = ar[0];
	for i := 0; i < size; i++ {
		max_curr = max(ar[i], ar[i]+max_curr);

		if max_curr>max_glo {
			max_glo=max_curr;
		}
	}

	return max_glo;
}

func main() {
	var  ar = []int {-2,3,2,-1};
	var res int;
	res = kadane(ar,4);
	fmt.Println("%d ",res);
}
