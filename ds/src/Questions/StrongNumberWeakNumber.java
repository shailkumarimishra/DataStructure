package Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StrongNumberWeakNumber {
public static void main(String[] args) {
	int number=24;
	List<Integer>list=new ArrayList<>();
	Map<Integer,Integer> map=new HashMap<>();
	for(int i=2;i<number;i++) {
		while(number%i==0) {
//		list.add(i);
			list.add(i);
		number=number/i;
		}
	}
	if(number>2)
		list.add(number);
	for(int i=0;i<list.size();i++) {
		int count=1;
		int j = list.get(i);
		int temp=i+1;
		while(temp++<list.size()-1) {
			if(j==list.get(temp)) {
				count++;
			}
		}
		map.put(j, count);
	}
	System.out.println(map);
}
}
