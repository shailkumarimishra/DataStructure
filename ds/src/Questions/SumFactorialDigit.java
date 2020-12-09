package Questions;

public class SumFactorialDigit {
public static int sumFactorialDigit(int n) {
	if(n==0) {
		return 1;
	}
	int rem;
	int fact=1;
	int sum=0;
	int i=n;
	for(;i>0;i=i/10) {
		rem=i%10;
		for(int j=rem;j>0;j--) {
			fact=fact*j;
		}
		sum=sum+fact;
		fact=1;
	}
	return sum;
}
public static void main(String[] args) {
	int result = sumFactorialDigit(124);
	System.out.println(result);
}
}
