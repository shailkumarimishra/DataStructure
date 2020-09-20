package array;

public class LowestCommonFactor {
public int lowestCommonFactor(int num1,int num2) {
	int gcf=new GreatestCommonFactor().greatestCommonFactor(num1, num2);
	int lcf=(num1*num2)/gcf;
	return lcf;
}
public static void main(String[] args) {
	int lcf = new LowestCommonFactor().lowestCommonFactor(65,50);
	System.out.println(lcf);
}
}
