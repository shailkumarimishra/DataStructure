package Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TripletAndAverage {
	public static int countTriplet(int[] arr) {
		List<Integer> tripletSum=new ArrayList<>();
		int result=0;
		for(int i=0;i<arr.length-2;i++) {
			int current=i;
			int next=i+1;
			int postNext=i+2;
			int sum=0;
			if(arr[current]<arr[next]) {
				if(arr[next]<arr[postNext]) {
					sum=arr[current]+arr[next]+arr[postNext];
					tripletSum.add(sum);
				}
			}
		}
		for(int a:tripletSum) {
			if(a%3==0)
				result++;
		}
		return result;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int len = sc.nextInt();
	int[] input=new int[len];
	for(int i=0;i<len;i++) {
		input[i]=sc.nextInt();
	}
	System.out.println(countTriplet(input));
}
}
