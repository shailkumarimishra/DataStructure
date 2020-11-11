package Questions;

import java.util.Scanner;

public class ConvertNumToWord {
	// International Standard
	private static final String[] UNITS = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine" };
	private static final String[] TWO_DIGITS = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
			"Sixteen", "Seventeen", "Eighteen", "Nineteen" };
	private static final String[] TEN_MULTIPLE = { "", "", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy",
			"Eighty", "Ninety" };
	private static final String[] PLACE_VALUES = { "", "Thousand", "Million", "Billion", "Trillion"

	};
	public String numberToWord(long number) {
		String word="";
		int index=0;
		do {
			//take 3 digits in each iteration
			int num=(int)(number%1000);
			if(num!=0) {
				String str=numberToWordHelper(num);
				word=str+" "+PLACE_VALUES[index]+" "+word;
			}
			index++;
			//next 3 digit
			number=number/1000;
		}while(number>0);
		return word;
	}
	//converts 3 digit number
	private String numberToWordHelper(int number) {
		String word="";
		int num=number%100;
		if(num < 10) {
			word=word+UNITS[num];
		}
		else if(num < 20) {
			word=word+TWO_DIGITS[num%10];
		}
		else {
			word=TEN_MULTIPLE[num/10]+" "+UNITS[num%10];
		}
		return (number/100>0) ? UNITS[number/100]+" Hundred"+" "+word:word;
	}
 public static void main(String[] args) {
	 ConvertNumToWord convert=new ConvertNumToWord();
	 Scanner sc=new Scanner(System.in);
	 long number = sc.nextLong();
	 sc.close();
	 String word = convert.numberToWord(number);
	 System.out.println(word);
	 
}
}
