package graph;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
	List<Node> nodeList=new ArrayList<>();
	for(int i=1;i<=10;i++) {
		nodeList.add(new Node("V"+i));
	}
	BFSByLinkedList graph=new BFSByLinkedList(nodeList);
	graph.addUndirectedEdge(1, 2);
	graph.addUndirectedEdge(1, 4);
	graph.addUndirectedEdge(2, 3);
	graph.addUndirectedEdge(2, 5);
	graph.addUndirectedEdge(3, 6);
	graph.addUndirectedEdge(3, 10);
	graph.addUndirectedEdge(4, 7);
	graph.addUndirectedEdge(5, 8);
	graph.addUndirectedEdge(6, 9);
	graph.addUndirectedEdge(7, 8);
	graph.addUndirectedEdge(8, 9);
	graph.addUndirectedEdge(9, 10);
	//Assuming V1 is a source node 
	graph.bfs();
}
}
