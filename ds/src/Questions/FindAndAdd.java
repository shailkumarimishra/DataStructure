package Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAndAdd {
	private static List<String> list;
public static void result(List<String> li,int n) {
	List<String> dict=new ArrayList<>();
	
	for(int i=0;i<=n;i++) {
		int count=0;
		String input = li.get(i);
		String[] words = input.split(" ");
		if(words[0].equals("add")) {
			dict.add(words[1]);
		}
		if(words[0].equals("find")) {
			for(String s:dict) {
				if(s.contains(words[1])) {
					count++;
				}
			}
			System.out.println(count);
		}
		
	}
	
}

public static void main(String[] args) {
list=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	int operations = sc.nextInt();
	for(int i=0;i<=operations;i++) {
		list.add(sc.nextLine());
	}
	result(list, operations);
}
}
