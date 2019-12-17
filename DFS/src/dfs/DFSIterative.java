package dfs;
import java.util.*;
import node.GraphNode;

public class DFSIterative {
	/*
	 Create an array list of type Graph node
	in which every index of the array list contains an object of the graph node class
	With the following attributes
		- index 
		- name
		- parent
		- isVisited 
		- ArrayList<GraphNode> neighbors 
	*/
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();


	public DFSIterative(ArrayList<GraphNode> nodeList) {  // Constructor
		
		this.nodeList = nodeList;
	}
	
	
	void dfs() {
		//if a node is unvisited then run dfs on it
		for(GraphNode node: nodeList) {
			if(!node.isVisited())
				dfsVisit(node);
		}
	}
	
	
	//dfs traversal by a source node
	void dfsVisit(GraphNode node) {
		//make an empty stack
		Stack<GraphNode> stack_of_verices = new Stack<>();
		//add source node to stack
		stack_of_verices.push(node);
		//while queue is not empty
		while(!stack_of_verices.isEmpty()) {
			//pop a node from stack
			GraphNode current_vertix = stack_of_verices.pop();
			//mark node as visited
			current_vertix.setVisited(true);
			//print the node
			System.out.print(current_vertix.getName() + " ");
			//for each neighbor of present node
			for(GraphNode neighbor: current_vertix.getNeighbors()) {
				//if neighbor is not visited then add it to queue
				if(!neighbor.isVisited()) {
					//add the unvisited neighbor of the current vertix and set it as visited
					stack_of_verices.add(neighbor);
					neighbor.setVisited(true);
				}
			}
		
		}
	}
	
	
	// add an undirected edge between two nodes
	public void addUndirectedEdge(int i, int j) {
		GraphNode first = nodeList.get(i-1);
		GraphNode second = nodeList.get(j-1);
		first.getNeighbors().add(second);
		second.getNeighbors().add(first);
	}
	
}
