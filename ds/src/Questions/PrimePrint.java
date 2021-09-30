package Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimePrint {
	int count=0;
	public void prime(int n) {
		List<Integer> input=new ArrayList<>();
		for(int i=1;i<=n;i++) {
			if(i==0 || i==1) {
				continue;
			}
			count=1;
			for(int j=2;j<=i/2;++j) {
				if(i%j==0) {
					count=0;
					break;
				}
			}
			if(count==1) 
				input.add(i);
		}
		String out="";
		out+=input.get(0);
		for(int i=1;i<input.size();i++) {
			System.out.print(out+","+input.get(i));
			out="";
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		new PrimePrint().prime(n);

	}

}
