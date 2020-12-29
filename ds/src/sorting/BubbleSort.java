package sorting;

public class BubbleSort {
	/* improve code by reducing no of comparison and write it's time complexity and no
	   of comparison.*/
public int[] bubbleSort(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<=i;j++) {
			if(arr[i]<arr[j]) {
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
	}
	return arr;
}
public static void main(String[] args) {
	BubbleSort sort=new BubbleSort();
	int[] arr= {10,5,3,20,4,30};
	int[] result = sort.bubbleSort(arr);
	for(int a:result) {
		System.out.print(a+" ");
	}
}
}
