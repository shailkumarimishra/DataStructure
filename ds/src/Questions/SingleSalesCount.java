package Questions;

import java.util.Scanner;

public class SingleSalesCount {
static final int MAX_CHAR=256;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int temp=0;
		String n = sc.nextLine();
		int count[]=new int[MAX_CHAR];
		int len = n.length();
		for(int i=0;i<len;i++)
			count[n.charAt(i)]++;
		char[] ch=new char[n.length()];
		for(int i=0;i<len;i++) {
			ch[i]=n.charAt(i);
			int find=0;
			for(int j=0;j<=i;j++) {
				if(n.charAt(i)==ch[j])
					find++;
			}
			if(find==1) {
				if(count[n.charAt(i)]==1)
					temp++;
			}
		}
		System.out.println(temp);
	}

}
