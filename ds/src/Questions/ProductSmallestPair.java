package Questions;

public class ProductSmallestPair {
public static int productSmallestPair(int sum, int[] arr,int n) {
	int temp;
	if(arr==null || n<2) {
		return -1;
	}
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	if(arr[0]+arr[1]<=sum) {
		return arr[0]*arr[1];
	}
	return 0;
}
public static void main(String[] args) {
	int arr[]= {9,8,3,-7,3,9};
	System.out.println(productSmallestPair(4, arr,arr.length));
	
}
}
