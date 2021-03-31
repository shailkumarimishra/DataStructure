package Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmstrongNoBetweenIntervals {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int low=0;
	int high=0;
	int move=0;
	List<Integer> armstrong=new ArrayList<>();
//	take input
	while(sc.hasNextLine()) {
		String next = sc.nextLine();
		if("".equals(next)) {
			break;
		}else {
		if(move==0) {
			low=Integer.valueOf(next);
			move++;
		}
			high=Integer.valueOf(next);
		}
	}
	sc.close();
	for(int num=low+1;num<high;++num) {
		int count=0;
		int result=0;
		int original=num;
//		calculate digits length
		count =(int) Math.floor(1+(Math.log(original)/Math.log(10)));
//		result contains sum of nth number
		while(original!=0) {
			int rem=original%10;
			result =result+(int) Math.pow(rem, count);
			original/=10;
		}
		if(result==num) {
			armstrong.add(num);
		}
	}
	if(armstrong.size()!=0) {
		System.out.println("Armstrong Numbers Between the Given Interval are :");
		for(int i=0;i<armstrong.size();i++)
			System.out.print(armstrong.get(i)+" ");
	}
	else
		System.out.println("Armstrong Number not Found between the Given Interval.");
}
}
