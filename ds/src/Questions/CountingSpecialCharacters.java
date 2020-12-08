package Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * A company has launched a new text editor that allows users to enter English letters, numbers and white spaces only.
 * If a user attempts to enter any other type of character, it is counted as a miss.
 * 
 * Given a String of text, write an algorithm to help the developer detects the number of misses by a given user in 
 * the given input. 
 */
public class CountingSpecialCharacters {
	public static void main(String[] args) {
		int miss;
		List<String> eng = new ArrayList<>();
		for (int i = 48; i <= 57; i++) {

			eng.add(new Character((char) i).toString());
		}
		for (int i = 65; i <= 90; i++) {
			eng.add(new Character((char) i).toString());
		}
		for (int i = 97; i <= 122; i++) {
			eng.add(new Character((char) i).toString());
		}
		eng.add(" ");
		Scanner sc = new Scanner(System.in);
		String next = sc.nextLine();
		int length = next.length();
		String sub = next;
		int count = 0;
		for (int i = 0; i < length; i++, sub = sub.substring(1)) {
			String sub1 = sub.substring(0, 1);
			if (eng.contains(sub1)) {
				count++;
			}
		}
		miss = length - count;
		System.out.println(miss);
	}
}
