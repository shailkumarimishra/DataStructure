package array;

public class FactorialRecursion {
public int factorial(int number) {
	if(number<1) {
	return 1;
	}
	return number*factorial(number-1);
}
public static void main(String[] args) {
	int factorial = new FactorialRecursion().factorial(0);
	System.out.println(factorial);
}
}
