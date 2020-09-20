package array;

public class Armstrong {
public boolean armstrongNumber(int number) {
	int temp=number;
	int sum=0;
	int length = new NumbersLength().numberLength(number);
	int divisor=10;
	for(int i=1;i<length-1;i++) {
		divisor=divisor*10;
	}
	while(divisor>=1) {
		int remainder=number/divisor;
		sum=sum+(remainder*remainder*remainder);
		number=number%divisor;
		divisor=divisor/10;
	}
	if(sum==temp) {
		return true;
	}
	return false;
}
public static void main(String[] args) {
	System.out.println(new Armstrong().armstrongNumber(407));
}
}
