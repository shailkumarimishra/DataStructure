package array;

public class PrimeNumber{
public void primeNumber(int number) {
	int count=0;
	if(number==2) {
		System.out.println(number+" is a Prime number.");
	}
	else {
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				count++;
			}
		}
		if(count>0 || number<2) {
			System.out.println(number+" not a Prime number.");
		}
		else {
			System.out.println(number+" is a Prime number.");
		}
	}
}
public static void main(String[] args) {
	new PrimeNumber().primeNumber(374);
}
}
