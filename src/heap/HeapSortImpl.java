package heap;

public class HeapSortImpl {

	static class HeapSort{
		int n;
		int ar[];

		HeapSort(int size, int[] a){
			n=size-1;
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

		void Max_Heapify(int i, int n){
			int l = leftChild(i);
			int r = rightChild(i);
			int largest=i;
			if(l<=n && ar[l]>ar[i]) {
				largest = l;
			}

			if(r<=n && ar[r]>ar[largest]) {
				largest = r;
			}

			if(largest != i) {
				swap(i,largest);
				Max_Heapify(largest,n);
			}
		}

		void buildMaxHeap() {

			for(int i=Math.floorDiv(n, 2); i>=0; i--) {
				Max_Heapify(i,n);
			}
		}

		void heapSort() {
			buildMaxHeap();
			int size = ar.length;
			for(int i=ar.length-1;i>=1;i--) {
				
				swap(i,0);
				System.out.println("i  "+i);
				size = size - 1;
				Max_Heapify(1,size);
				System.out.println("size  "+size);
			}
			
			for(int i=0;i<ar.length;i++) {
				System.out.print(ar[i]+" ");
			}
		}

		void printRes() {
			for(int i=0;i<ar.length;i++) {
				System.out.print(ar[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		//int ar[] = {4,10,3,5,1};
		int ar[] = {12, 11, 13, 5, 6, 7}; 
		int a=ar.length;
		HeapSort hs = new HeapSort(a,ar);

		hs.heapSort();
		//hs.printRes();
	}

}
