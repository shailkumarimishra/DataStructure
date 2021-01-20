package graph;

import java.util.ArrayList;
import java.util.List;

public class Node {
private String name;
private int index;
private List<Node> neighbours=new ArrayList<>();
private boolean isVisited;
private Node parent;
public Node(String name, int index) {
	this.name = name;
	this.index = index;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getIndex() {
	return index;
}
public void setIndex(int index) {
	this.index = index;
}
public List<Node> getNeighbours() {
	return neighbours;
}
public void setNeighbours(List<Node> neighbours) {
	this.neighbours = neighbours;
}
public boolean isVisited() {
	return isVisited;
}
public void setVisited(boolean isVisited) {
	this.isVisited = isVisited;
}
public Node getParent() {
	return parent;
}
public void setParent(Node parent) {
	this.parent = parent;
}
public Node(String name) {
	this.name = name;
}
@Override
public String toString() {
	return name;
}

}
