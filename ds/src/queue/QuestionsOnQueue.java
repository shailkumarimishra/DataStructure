package queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Q1. Implement stack using Queue.
 * Q2. Reverse a Queue.
 * Q3. Given a number n print first n numbers (in increasing order) such that all such
 * 	   numbers have digits in set {5,6}.
 * Q4. take any 2 digit no and print it's combination in ascending order.
 */
public class QuestionsOnQueue {
	private Queue<String> queue;
	public void digitsSet(Integer num) {
		int n=num/10;
		int m=num%10;
		if(n>m) {
			num=num-9;
		}
		String[] digits = num.toString().split("");
		for(int i=0;i<digits.length;i++) {
			if(!(i==digits.length-1)) {
				queue.add(digits[i]+digits[i]);
				queue.add(digits[i]+digits[i+1]);
			}
			else {
				queue.add(digits[i]+digits[i-1]);
				queue.add(digits[i]+digits[i]);
			}
		}
		queue.forEach(System.out::println);
	}
	
public QuestionsOnQueue() {
	this.queue=new LinkedList<>();
	}

public static void main(String[] args) {
	new QuestionsOnQueue().digitsSet(65);//assuming 9<n<100
	
}
}
