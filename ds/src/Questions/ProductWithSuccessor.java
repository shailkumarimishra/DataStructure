package Questions;

import java.util.Scanner;

public class ProductWithSuccessor {
public static int sumProductSuccesor(int[] a) {
	int sum=0;
	for(int i:a) {
		sum=sum+(i*(i+1));
	}
	return sum;
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len = sc.nextInt();
		int[] input=new int[len];
		for(int i=0;i<len;i++) {
			input[i]=sc.nextInt();
		}
		System.out.println(sumProductSuccesor(input));
	}

}
