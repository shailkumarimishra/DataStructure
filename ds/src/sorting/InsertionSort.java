package sorting;
/*
 * 1. Divide the given array into two parts sorted and unsorted
 * 2. From unsorted array pick the first element & find it's correct position in sorted
 * 	  array
 * 3. Repeat till unsorted array is not empty 
 */
public class InsertionSort {
public int[] insertionSort(int[] arr) {
	//pick the element from unsorted array 
	for(int i=1;i<arr.length;i++) {
		int temp=arr[i];
		int j=i;
		//find the appropriate position in the sorted array
		while(j>0 && arr[j-1]>temp) {
			arr[j]=arr[j-1];
			j--;
		}
		//insert the picked element
		arr[j]=temp;
	}
	return arr;
}
public static void main(String[] args) {
	InsertionSort sort =new InsertionSort();
	int[] arr= {10,5,3,20,4,30};
	int[] result = sort.insertionSort(arr);
	for(int a:result) {
		System.out.print(a+" ");
	}
}
}
