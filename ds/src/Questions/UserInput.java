package Questions;

import java.util.Scanner;

public class UserInput {
public static void main(String[] args) {
	int[][] matrix=new int[4][4];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<4;i++) {
		String next = sc.nextLine();
		String[] input = next.split(" ");
		for(int j=0;j<4;j++) {
			matrix[i][j]=Integer.valueOf(input[j]);
		}
	}
	
	for(int[] k:matrix) {
		for(int a:k) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	int sum=0;
	for(int z=0;z<4;z++) {
		sum=sum+matrix[z][z];
	}
	System.out.println(sum);
}
}
