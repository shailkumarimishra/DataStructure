package sorting;
/*
 * 1. Quick Sort is a divide and conquer algorithm
 * 2. At each step find pivot and then make sure all the smaller elements are on the
 *    left of pivot & all Bigger elements are on the right of pivot.
 * 3. It does this recursively until the entire array is sorted.
 * 4. Unlike merge sort it does not require any extra space.
 * e.g; 9,4,6,3,7,1,2,11,5
 * Note:- Assume p is pivot element & j is first element(j=0) and i=-1;
 * compare j<=p then swap i & j.
 * 
 */
public class QuickSort {
public int[] quickSort(int[] arr) {
	return quickSortHelper(arr,0,arr.length-1);
}
private int[] quickSortHelper(int[] arr,int start,int end) {
	//if array is not empty.
	if(start<end) {
		//find pivot element.
		int pivot = findPivot(arr,start,end);
		quickSortHelper(arr, start, pivot-1);
		quickSortHelper(arr,pivot+1,end);
	}
	return arr;
}
private int findPivot(int[] arr,int p,int q) {
	int pivot=q;
	int i=p-1;
	for(int j=p;j<=q;j++) {
		if(arr[j]<=arr[pivot]) {
			i++;
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	return i;
}
public static void main(String[] args) {
	QuickSort sort=new QuickSort();
	int[] arr= {9,4,6,3,7,1,2,11,5};
	 int[] result = sort.quickSort(arr);
	 for(int a:result) {
		 System.out.print(a+" ");
	 }
}
}
