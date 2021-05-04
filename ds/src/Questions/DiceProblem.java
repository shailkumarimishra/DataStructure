package Questions;

import java.util.Scanner;

public class DiceProblem {
	public static int probabilitySum(int sum) {
		int count=0;
		for(int i=1;i<7;i++) {
			for(int j=1;j<7;j++) {
				int plus=i+j;
				if(plus==sum) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String next = sc.next();
		sc.close();
		int sum = Integer.parseInt(next);
		int prob = DiceProblem.probabilitySum(sum);
		System.out.println(prob);
	}

}
