package Questions;

import java.util.Scanner;

public class AccentureCodingQuestion {
	public static String straightLine(int[][] n) {
		if(n.length==0) {
			return "0";
		}
		int x1=n[0][0];
		int y1=n[0][1];
		int slope=0;
		for(int i=1;i<n.length;i++) {
			int x2=n[i][0];
			int y2=n[i][0];
			if(x2-x1==0) {
				return "0";
			}
			if(slope==0) {
				slope=(y2-y1)/(x2-x1);
				continue;
			}
			int slope2=(y2-y1)/(x2-x1);
			if(slope!=slope2) {
				return "0";
			}
		}
		return slope+"x-"+y1+"y=0";
	}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int input=sc.nextInt();
	int[] s=new int[2*input];
	for(int i=0;i<s.length;i++) {
		 s[i] = sc.nextInt();
	}
	int count=0;
	int n[][]=new int[input][2]; 
	for(int i=0;i<input;i++) {
		for(int j=0;j<2 && count<s.length;j++) {
			n[i][j]=s[count++];
		}
	}
	System.out.println(straightLine(n));
}
}
