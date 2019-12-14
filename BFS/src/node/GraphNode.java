package node;

import java.util.*;

public class GraphNode {
	
	private int index;     //index is used to map this Node's name with index of Adjacency Matrix' cell#
	private String name;   // Node (Vertex) Name
	private GraphNode parent;
	private boolean isVisited = false;
	private ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();

	
	public GraphNode(String name, int index) {
		setName(name);
		setIndex(index);
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

	public ArrayList<GraphNode> getNeighbors() {
		return neighbors;
	}

	public void setNeighbors(ArrayList<GraphNode> neighbors) {
		this.neighbors = neighbors;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public GraphNode getParent() {
		return parent;
	}

	public void setParent(GraphNode parent) {
		this.parent = parent;
	}

	public GraphNode(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return  name ;
	}
}
