package Questions;

import java.util.Scanner;

public class DivisiblityBySumOrProduct {
public static int countNum(int[] in) {
	int count=0;
	for(int a:in) {
		int temp=a;
		int sum=0;
		int prod=1;
		while(a!=0) {
			int newNum=a/10;
			int rem=a%10;
			sum=sum+rem;
			if(rem!=0)
			prod=prod*rem;
			a=newNum;
		}
		if(temp%sum==0||temp%prod==0) {
			count++;
		}
	}
	return count;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len = sc.nextInt();
		int[] input=new int[len];
		for(int i=0;i<len;i++) {
			input[i]=sc.nextInt();
		}
		System.out.println(countNum(input));
	}

}
