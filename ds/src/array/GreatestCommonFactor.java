package array;

public class GreatestCommonFactor {
public int greatestCommonFactor(int num1,int num2) {
	int remainder=num1%num2;
	while(remainder!=0) {
		num1=num2;
		num2=remainder;
		remainder=num1%num2;
	}
	return num2;
}
public static void main(String[] args) {
	int gcf = new GreatestCommonFactor().greatestCommonFactor(3556,3224);
	System.out.println(gcf);
}
}
