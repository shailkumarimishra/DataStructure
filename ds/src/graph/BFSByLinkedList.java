package graph;

import java.util.LinkedList;
import java.util.List;

public class BFSByLinkedList {
private List<Node> nodeList;

public BFSByLinkedList(List<Node> nodeList) {
	this.nodeList = nodeList;
}
/**
 * BFS Algorithm :-
 * 
 */
public void bfs() {
	for(Node node:nodeList) {
		if(!node.isVisited()) {
			//visit node
			visitNode(node);
		}
	}
}
public void visitNode(Node node) {
	LinkedList<Node> queue=new LinkedList<>();
	queue.add(node);// add source node to queue
	while(!queue.isEmpty()) {
		Node presentNode=queue.remove(0);
		presentNode.setVisited(true);
		System.out.print(presentNode.getName()+" ");
		for(Node neighbour:presentNode.getNeighbours()) {
			if(!neighbour.isVisited()) {
				queue.add(neighbour);
				neighbour.setVisited(true);
			}
		}
	}
}
public void addUndirectedEdge(int i,int j) {
	Node first=nodeList.get(i-1);
	Node second=nodeList.get(j-1);
	first.getNeighbours().add(second);
	second.getNeighbours().add(first);
}
}
