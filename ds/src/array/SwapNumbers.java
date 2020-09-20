package array;

public class SwapNumbers {
	/*
	 * 1. print num1 and num2 given value
	 * 2. add num1 and num2 and store value into num1
	 * 3. then subtract num1 and num2 and store it into num2
	 * 4. finally, subtract num1 and num2 and store it into num1 
	 * 5. now, print num1 and num2 swapped value.
	 * T.C:- 0(1)
	 * S.C:- 0(1)
	 */
	public void swapNumber(int num1,int num2) {
		System.out.println("original value of num1= "+num1+" and num2= "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("Swapped value of num1= "+num1+" and num2= "+num2);
	}
	public static void main(String[] args) {
		new SwapNumbers().swapNumber(5,20);
	}

}
