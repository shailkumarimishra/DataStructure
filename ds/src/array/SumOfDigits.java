package array;

public class SumOfDigits {
	public int sumOfDigits(int number) {
		int sum=0;
		int length = new NumbersLength().numberLength(number);
		int divisor=10;
		for(int i=1;i<length-1;i++) {
			divisor=divisor*10;
		}
		while(divisor>=1) {
			sum=sum+(number/divisor);
			number=number%divisor;
			divisor=divisor/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int sum = new SumOfDigits().sumOfDigits(3);
		System.out.println(sum);
	}

}
