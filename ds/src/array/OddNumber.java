package array;

public class OddNumber {
	/*
	 * 1. number%2 not equal to 0 if block will execute otherwise else block will execute.
	 * T.C:- 0(1)
	 * S.C:- 0(1)
	 */
public void oddNumber(int number) {
	if(number%2!=0) {
		System.out.println(number+" is an odd number");
	}
	else {
		System.out.println("Not an odd number");
	}
}
public static void main(String[] args) {
	OddNumber number=new OddNumber();
	number.oddNumber(55);
}
}
