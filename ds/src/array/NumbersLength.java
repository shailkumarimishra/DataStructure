package array;

public class NumbersLength {
	/*
	 * 1. take a variable count and initialize it with 1
	 * 2. take another variable divisor and initialize with 10
	 * 3. now number%divisor and store it in remainder
	 * 4. if remainder not equal to number then execute loop
	 *   a) divisor=divisor*10
	 * 	 b) now repeat step 3
	 *   c) then increase count
	 *   d) repeat step 4 
	 * 5. finally, return count which will give the length of number
	 * T.C:- 0()
	 * S.C:- 0(1)
	 */
	public int numberLength(int number) {
		int count=1;
		int divisor=10;
		int remainder=number%divisor;
		while(remainder!=number) {
			divisor=divisor*10;
			remainder=number%divisor;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		int length = new NumbersLength().numberLength(17354237);
		System.out.println(length);
//		System.out.println(Math.floor(1+(Math.log(123)/Math.log(10))));
	}
}
