package ds;

public class Factorial {
	public static int factorial(int num) {
		if (num <= 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}
	public static int fact(int num) {
		int fact=1;
			for(int i=num;i>=1;i--) {
				fact=fact*i;
			}
			return fact;
		
	}
	
	
	public static void main(String[] args) {
		int fact = Factorial.factorial(5);
		System.out.println(fact);
		int fact2 = Factorial.fact(5);
		System.out.println(fact2);
	}
}
