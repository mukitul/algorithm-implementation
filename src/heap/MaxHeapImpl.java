package heap;

public class MaxHeapImpl {
	static class MaxHeap{

		int n;
		int ar[];

		MaxHeap(int size, int[] a){
			n=size;
			ar = a;
		}

		int leftChild(int i) {
			return 2*i;
		}

		int rightChild(int i) {
			return 2*i + 1;
		}

		void swap(int a, int b) {
			int tmp = ar[a];
			ar[a] = ar[b];
			ar[b] = tmp;
		}

		void Max_Heapify(int i){
			int l = leftChild(i);
			int r = rightChild(i);
			int largest=i;
			if(l<=n && ar[l]>ar[i]) {
				largest = l;
			}else {
				largest = i;
			}

			if(r<=n && ar[r]>ar[largest]) {
				largest = r;
			}

			if(largest != i) {
				swap(i,largest);
				Max_Heapify(largest);
			}
		}

		void buildMaxHeap() {

			for(int i=Math.floorDiv(n, 2)-1; i>=0; i--) {
				Max_Heapify(i);
			}
		}

		void printRes() {
			for(int i=0;i<n;i++) {
				System.out.print(ar[i]+" ");
			}
		}


	}
	public static void main(String[] args) {

		//int ar[] = {4,10,3,5,1};
		int ar[] = {12, 11, 13, 5, 6, 7}; 
		int a=ar.length;
		MaxHeap mh = new MaxHeap(a,ar);

		mh.buildMaxHeap();
		mh.printRes();
	}

}
