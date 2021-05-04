package Questions;

public class MaxMinQuadraticEquation {
	public int maximaOrMinima(int a, int b,int c) {
		int result=0;
		if(a>0) {
			int x=-1;
			result=(a*(x*x))+(b*(x))+c;
			return result;
		}
		else {
			result=((4*a*c)-(b*b))/(4*a);
			return result;
		}
	}

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=1;
		int output = new MaxMinQuadraticEquation().maximaOrMinima(a, b, c);
		System.out.println(output);

	}

}
