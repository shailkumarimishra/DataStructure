package Questions;

public class Gp {
public double nthTerm(double input1, double input2, int input3) {
	double r=input2/input1;
	double a1=input1/r;
	double result=Math.pow(r,input3-1)*a1;
//	if(input3==0) {
//		return a1;
//	}
//	if(r==1) {
//		return input1;
//	}
	return result;
}
public static void main(String[] args) {
	double output = new Gp().nthTerm(1, 2, 4);
	System.out.println(output);
}
}
