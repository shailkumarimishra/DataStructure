package Questions;

import java.util.Scanner;

public class StringArrayAFirst {
	public static int countAFirstItem(String[] s) {
		int result=0;
		for(int i=0;i<s.length;i++) {
			String str=s[i];
			if(str.charAt(0)=='A'||str.charAt(0)=='a')
				result++;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		String[] input=new String[len];
		for(int i=0;i<len;i++) {
			input[i]=sc.next();
		}
		System.out.println(countAFirstItem(input));
	}

}
