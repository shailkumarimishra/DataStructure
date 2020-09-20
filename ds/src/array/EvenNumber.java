package array;

public class EvenNumber {
	/*
	 * 1. number%2 equal to 0 if block will execute otherwise else block will execute.
	 * T.C:- 0(1)
	 * S.C:- 0(1)
	 */
public void evenNumber(int number) {
	if(number%2==0) {
		System.out.println(number+" is an even number");
	}
	else {
		System.out.println(number+" is not an even number");
	}
}
public static void main(String[] args) {
	EvenNumber num=new EvenNumber();
	num.evenNumber(19);
}
}
