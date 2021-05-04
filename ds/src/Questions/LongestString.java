package Questions;

import java.util.HashMap;
import java.util.Map;

public class LongestString {
public static void main(String[] args) {
	String s="abbccccdeef";
	char[] arr = s.toCharArray();
	int len = arr.length;
	System.out.println(len);
	Map<Character,Integer> map=new HashMap<>();
	int temp=0;
	int count=1;
	char c = arr[temp];
	
	System.out.println(map);
}
}
