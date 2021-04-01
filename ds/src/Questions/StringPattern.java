package Questions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Q1. Any particular string is given u have to print all its possible combination
 * as explained below:-
 * for e.g; 
 * 			Input="abcdef"
 * 			Output="efabcd","cdefab"
 */
public class StringPattern {
	public static Set<String> printAllStringCombination(String s) {
		Set<String> output = new HashSet<>();
		String temp = s;
		do {
			String endString = temp.substring(temp.length() - 2);
			temp = endString.concat(temp.substring(0, temp.length() - 2));
			if (!temp.equals(s))
				output.add(temp);
		} while (!temp.equals(s));

		return output;
	}

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			String input = "";
			Set<String> output = null;
			while (sc.hasNextLine()) {
				input = sc.nextLine();
				if ("".equals(input)) {
					break;
				}
				output = printAllStringCombination(input);
			}

			output.forEach(System.out::println);
		}
	}
}
