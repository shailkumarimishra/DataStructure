package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class MiddleOfSLL {
 public void middleData(List<Integer> list) {
	 if(list.size()>0) {
		 if(list.size()%2!=0) {
			 int middle=(list.size()-1)/2;
			 System.out.println(list.get(middle));
			 return;
		 }
		 else {
			 int middle1=(list.size()/2)-1;
			 int middle2=list.size()/2;
			 System.out.println(list.get(middle1)+" "+list.get(middle2));
		 }
	 }
	 else {
		 System.out.println("list is empty!");
	 }
 }
 public static void main(String[] args) {
	List <Integer> list=new LinkedList<>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	list.add(60);
	list.add(70);
	new MiddleOfSLL().middleData(list);
}
}
