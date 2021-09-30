
package Questions;

import java.util.Scanner;
/*
 * Input:- 1 2 3 2 1 45 56 67 54 3 2
 * output:- 168 
 * 			reason-> Increasesum1=1+2+3=6
 * 			 		 Increasesum2=45+56+67=168
 * 
 */
public class IncreaseOrderSum {
	public int sumNum(int[] arr) {
		int key=0;
		int sum=0;
		int x=0;
		int tempSum=0;
		while(x++<arr.length) {
			int current=arr[key];
			int next=arr[key+1];
			if(current>next) {
				key=key+1;
				tempSum=sum;
				sum=0;
			}else {
				sum=sum+current;
				key=key+1;
			}
		}
		if(tempSum>sum)
			return tempSum;
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int in[]=new int[n];
		int count=0;
		while(sc.hasNextLine() && count<n) {
			in[count++]=Integer.parseInt(sc.nextLine());
		}
		int sumNum = new IncreaseOrderSum().sumNum(in);
		System.out.println(sumNum);
	}

}
