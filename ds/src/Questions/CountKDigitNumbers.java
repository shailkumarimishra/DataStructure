package Questions;

import java.util.Scanner;

public class CountKDigitNumbers {
public static int  countKDigitNumbers(int arr[],int k) {
	int count=0;
	for(int i=0;i<arr.length;i++) {
		int len =(int) Math.floor(1+(Math.log(arr[i])/Math.log(10)));
		if(len==k) {
			count++;
		}
	}
	return count;
}
public static void main(String[] args) {
//	nmmjScanner sc=new Scanner(System.in);
	
	int arr[]= {1,2,22,3,34,899,112,3,44,552};
	int count = countKDigitNumbers(arr,2);
	System.out.println(count);
}
}
