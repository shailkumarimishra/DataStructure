package Questions;

import java.util.Scanner;

public class ApplicationToken {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		String n = sc.nextLine();
		char[] arr = n.toCharArray();
		int len = arr.length;
		int input = Integer.parseInt(n);
		String s="";
		for(int i=0;i<len;i++) {
			int check =input%10;
			if(check%2==0) {
				check=check+1;
			}
			else {
				check=check-1;
			}
			s=s+check;
			input=input/10;
		}
		sb.append(s);
		StringBuilder reverse = sb.reverse();
		System.out.println(reverse);
	}

}
