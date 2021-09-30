package Questions;

import java.util.Scanner;

public class ChocoFac {
	public int[] packaging(int [] arr,int n) {
		int count=0;
		int out[]=new int[n];
		for(int x=0;x<n;x++) {
			if(arr[x]==0) {
				count++;
			}
		}
		
		return out;
	}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	String in=sc.nextLine();
	String[] split = in.split(" ");
	int arr[]=new int[n];
	for(int s=0;s<n;s++) {
		arr[s]=Integer.parseInt(split[s]);
	}
}
}
