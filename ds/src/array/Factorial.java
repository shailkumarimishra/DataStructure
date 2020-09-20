package array;

public class Factorial {
public int factorial(int number) {
	int fact=1;
	for(int i=number;i>0;i--) {
		fact=fact*i;
	}
	return fact;
}
public static void main(String[] args) {
	int factorial = new Factorial().factorial(0);
	System.out.println(factorial);
}
}
