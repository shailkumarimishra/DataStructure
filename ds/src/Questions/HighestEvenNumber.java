package Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Assumption:-
 * 1.The array will always have 3 or more element.
 * 2.Array of elements separated by space.
 * Example:-
 * Input
 * 9
 * 6 8 9 2 43 3 5 42 15
 * Output
 * 6
 * @author HP
 *
 */
public class HighestEvenNumber {
public int getThirdHighestNumber(int length,List<Integer> list) {
	int count=0;
	Collections.sort(list);
	for(int i=length-1;i>=0;i--) {
		int value = list.get(i);
		if(value%2==0) {
			count=count+1;
			if(count==3) {
				return value;
			}
		}
	}
	return 0;
}
public static void main(String[] args) {
	HighestEvenNumber num=new HighestEvenNumber();	
	Scanner sc=new Scanner(System.in);
	int len = sc.nextInt();
	List<Integer> input=new ArrayList<>();
	for(int i=0;i<len;i++) {
		int next = sc.nextInt();
		input.add(next);
	}
	int result = num.getThirdHighestNumber(len,input);
	System.out.println(result);
}
}
