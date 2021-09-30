package Questions;

import java.util.Scanner;

public class MirrorPatternPrint {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	String count="";
	int i=1;
	for (i=1;i<=n;i++){
		count=count+i;
		int temp=1;
	    for(int j=i;temp<j;temp++){
	    	count=count+"*"+j;
	   }
	System.out.println(count);
	count="";
	}

	for (i=n;i>=1;i--){
		int temp=i;
		count=count+i;
	    for(int j=i;temp>1;temp--){
	    	count=count+"*"+j;
	   }
	System.out.println(count);
	count="";
	}
}
}
