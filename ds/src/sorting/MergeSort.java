package sorting;
/**
* 1.MergerSort is a divide and conquer algorithm.
* 2.It divides input array in two halves,keep breaking these two halves 
*   recursively until they become too small to be broken further.
* 3.Merge each of the broken pieces together.
* e.g.-30,20,40,10,80,50,15
*
*/
public class MergeSort {
public  int[] mergeSort(int[] arr) {
	
	return mergeSortHelper(arr, 0, arr.length-1);
}
private  int[] mergeSortHelper(int[] arr,int left,int right) {
	int[] result=null;
	if(right>left) {
		 int mid=(left+right)/2;
		 mergeSortHelper(arr,left,mid);
		 mergeSortHelper(arr, mid+1, right);
		//do the merge process
	  result= merge(arr, left, mid, right);
	}
	return result;
}
private int[] merge(int[] arr,int left,int mid,int right) {
	int[] tempLeft=new int[mid-left+2];
	int[] tempRight=new int[right-left+1];
	//copy values from array to above temp arrays
	for(int i=0;i<=mid-left;i++) {
		tempLeft[i]=arr[left+i];
		
	}
	for(int j=0;j<right-mid;j++) {
		tempRight[j]=arr[mid+1+j];
	}
	//merge values and insert into arr[]
	int i=0;
	int j=0;
	tempLeft[mid-left+1]=Integer.MAX_VALUE;
	tempRight[right-mid]=Integer.MAX_VALUE;
	for(int k=left;k<=right;k++) {
	if(tempLeft[i]<tempRight[j]) {
		arr[k]=tempLeft[i];
		i++;
	}
	else {
		arr[k]=tempRight[j];
		j++;
	}
	}
	return arr;
	
}

public static void main(String[] args) {
	MergeSort sort=new MergeSort();
    int[] arr= {10,5,3,20,4,30};
	 int[] result = sort.mergeSort(arr);
	 for(int a:result) {
		 System.out.print(a+" ");
	 }
	
}
}