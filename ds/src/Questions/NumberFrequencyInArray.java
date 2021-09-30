package Questions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class NumberFrequencyInArray {
public static Map<Integer, Integer> countNumber(int[] number){
	int temp;
	int count=1;
	Map<Integer,Integer> data=new HashMap<>();
	data.put(number[0], 1);
	while(count<number.length) {
		temp=number[count++];
		Iterator<Map.Entry<Integer,Integer>> itr=data.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer,Integer> map=itr.next();
			if(temp==map.getKey()) {
				map.setValue(map.getValue()+1);
			}
			else {
				data.put(temp,1);
			}
		}
	}
	return data;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String next = sc.nextLine();
		String[] split = next.split(" ");
		int input[]=new int[split.length];
		for(int i=0;i<input.length;i++) {
			input[i] = Integer.parseInt(split[i]);
		}
		Map<Integer, Integer> result = countNumber(input);
		for(Map.Entry<Integer,Integer> e:result.entrySet())
			System.out.println(e.getKey()+" "+e.getValue());
	}

}
