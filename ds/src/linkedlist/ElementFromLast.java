package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class ElementFromLast {
	private static List<Integer> list;

	public ElementFromLast() {
		list = new LinkedList<>();
	}

	public int elementFromLast(int node) {
		if (list.size() != 0) {
			if (node >= 0 && node < list.size()) {
				int position = list.size() - node;
				return list.get(position);
			} else {
				throw new RuntimeException("invalid index");
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		ElementFromLast data = new ElementFromLast();
//	System.out.println(data.elementFromLast(1));
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
		System.out.println(data.elementFromLast(4));

	}
}
