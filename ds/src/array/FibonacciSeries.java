package array;

public class FibonacciSeries {
private int previous=0;
private int current=1;
private int next=1;
public void fibonacci(int number) {
	for(int count=1;count<=number;count++) {
		if(count==1) {
			System.out.print(current+" ");
		}
		else {
			next=current+previous;
			System.out.print(next+" ");
			previous=current;
			current=next;
		}
	}
}
public static void main(String[] args) {
	new FibonacciSeries().fibonacci(10);
}
}
