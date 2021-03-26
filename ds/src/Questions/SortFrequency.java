package Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SortFrequency {
	public static int[] freqSort(int[] listEle) {
		int[] answer=new int[100];
		int size=0;
		Map<Integer, Integer> elementCountMap=new LinkedHashMap<>();
		for(int i=0;i<listEle.length;i++) {
			if(elementCountMap.containsKey(listEle[i])) {
				elementCountMap.put(listEle[i],elementCountMap.get(listEle[i])+1);
			}
			else {
				elementCountMap.put(listEle[i],1);
			}
		}
		ArrayList<Entry<Integer,Integer>> listOfEntry=new ArrayList<>(elementCountMap.entrySet());
		Collections.sort(listOfEntry,new Comparator<Entry<Integer,Integer>>(){
			@Override
			public int compare(Entry<Integer,Integer> o1,Entry<Integer,Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		for(Entry<Integer,Integer>entry:listOfEntry) {
			int frequency = entry.getValue();
			while(frequency>=1) {
				answer[size]=entry.getKey();
				size=size+1;
				frequency--;
			}
		}
		return answer;
	}
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	//input for listEle
	int listEle_size=in.nextInt();
	int[] listEle=new int[listEle_size];
	for(int idx=0;idx<listEle_size;idx++) {
		listEle[idx]=in.nextInt();
	}
	int[]result=freqSort(listEle);
	for(int idx=0;idx<listEle_size;idx++) {
		System.out.print(result[idx]+" ");
	}
}
}
