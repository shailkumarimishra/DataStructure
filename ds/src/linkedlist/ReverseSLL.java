package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class ReverseSLL {
	private static List<Integer> list;
	private static List<Integer> reverseList;
public ReverseSLL() {
	list= new LinkedList<>();
	reverseList= new LinkedList<>();
}

public List<Integer> reversedSLL(List<Integer> list){
	int index=list.size()-1;
	if(list.size()>0) {
		while(index>=0) {
			reverseList.add(list.get(index--));
		}
	}
	else {
		reverseList.add(-1);
	}
	return reverseList;
}

public static void main(String[] args) {
	ReverseSLL reverse=new ReverseSLL();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	list.add(60);
	list.add(70);
	list.add(80);
	list.add(90);
	list.add(100);
	reverse.reversedSLL(list).forEach(System.out::println);
}
}
