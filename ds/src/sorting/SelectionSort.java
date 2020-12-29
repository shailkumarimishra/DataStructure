package sorting;
/**
 * 1. Find/select the minimum value in the list
 * 2. Swap it with the value in the current position
 * 3. Repeat this process for all the elements until the array is sorted
 * T.C:-
 * S.C:-
 *
 */
public class SelectionSort {
public int[] selectionSort(int[] arr) {
	for(int i=0;i<arr.length-1;i++) {
		int minIndex=i;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<arr[minIndex]) {
				minIndex=j;
			}
		}
		//swapping
		int temp=arr[minIndex];
		arr[minIndex]=arr[i];
		arr[i]=temp;
	}
	return arr;
}
public static void main(String[] args) {
	SelectionSort sort=new SelectionSort();
	int[] arr= {10,5,3,20,4,30};
	int[] result = sort.selectionSort(arr);
	for(int a:result) {
		System.out.print(a+" ");
	}
}
}
