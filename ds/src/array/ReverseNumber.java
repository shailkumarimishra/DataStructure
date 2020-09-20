package array;

public class ReverseNumber {
	public String reverseNumber(int number) {
		String reverse="";
		int length = new NumbersLength().numberLength(number);
		for(int i=0;i<length;i++) {
			int remainder=number%10;
			number=number/10;
			reverse=reverse+remainder;
		}
		return reverse;
	}
	public static void main(String[] args) {
		String reverse = new ReverseNumber().reverseNumber(54367);
		System.out.println(reverse);
	}
}
