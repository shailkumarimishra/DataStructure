package Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LargetsLCM {
	public static int largeLcm(int[] in) {
		int gcd=1;
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<in.length-1;++i) {
			int num1=in[i];
			int num2=in[i+1];
			for(int j=1;j<=num1&&j<=num2;++j) {
				if(num1%j==0 && num2%j==0) {
					gcd=j;
				}
			}
			int lcm=(num1*num2)/gcd;
			l.add(lcm);
			gcd=1;
		}
		Collections.sort(l);
		return l.get(l.size()-1);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len = sc.nextInt();
		int[] input=new int[len];
		for(int i=0;i<len;i++) {
			input[i]=sc.nextInt();
		}
		System.out.println(largeLcm(input));
	}
}
