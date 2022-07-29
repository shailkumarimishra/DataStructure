package Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Order of alphabets is as follows:-
 * A | B | c | d | e | F | g | H | I | J | K | L | M | N | o | p | q | r | s | T | U |
 * 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10| 11| 12| 13| 14| 15| 16| 17| 18| 19| 20| 21|
 * v | w | x | y | z | 
 * 22| 23| 24| 25| 26|
 * 
 * in the given string count the number of characters in it's correct position.
 * 
 * Input:- abCxYF
 * Output:- 4
 * 
 * Note:- ignore case sensitivity
 * 
 */
public class DCAQ {
	private static Map<Integer,Character> insertPosition(){
		Map<Integer,Character> position = new HashMap<Integer,Character>();
		for(int i=97,j=1;i<123 && j<27;i++,j++) {
			position.put(j,(char)i);
		}
	return position;
	}
	
	public int checkCharPosition(String s) {
		int count=s.length();
		int i=0;
		int temp=0;
		while(count-->0 && i<s.length()) {
			Character character = insertPosition().get(i+1);
			char charAt = s.charAt(i++);
			if(Character.toString(charAt).equalsIgnoreCase(character.toString()))
				temp++;
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner("System.in");
		String in = sc.next();
		sc.close();
//		String in="abCxYF";
		int out = new DCAQ().checkCharPosition(in);
		System.out.println(out);

	}

}
