package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OTP {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String input=sc.nextLine();
	String[] split = input.split(" ");
	int num1 = Integer.parseInt(split[0]);
	int num2=Integer.parseInt(split[1]);
	int count;
	List<Integer> al=new ArrayList<>();
	for(int i=num1;i<=num2;i++) {
		count=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				count=count+1;
			}
		}
		if(count==2) {
			System.out.print(i+" ");
			al.add(i);
		}
	}
	Collections.sort(al);
	int min = al.get(0);
	int max = al.get(al.size()-1);
	System.out.println();
	System.out.println(min+max);
}
}
