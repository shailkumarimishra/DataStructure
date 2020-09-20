package array;

public class Palindrome {
public boolean palindrome(int number) {
	String num="";
	num=num+number;
	String reverse = new ReverseNumber().reverseNumber(number);
	if(num.equalsIgnoreCase(reverse)) {
		return true;
	}
	return false;
}
public static void main(String[] args) {
	System.out.println(new Palindrome().palindrome(153));
}
}
