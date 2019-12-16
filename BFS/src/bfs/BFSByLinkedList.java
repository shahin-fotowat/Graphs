package bfs;
import java.util.*;
import node.*;

public class BFSByLinkedList {

	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

	//Constructor
	public BFSByLinkedList(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}
	
	//BFS Algorithm
	void bfs() {
		//if a node is unvisited then run bfs on it
		for(GraphNode node: nodeList) {
			System.out.println("\n*** I'm here ***\n" + node.getName() + " - " + node.getIndex() + " - " + 
							   node.getParent() + " - " + node.getNeighbors() + " - " +
							   node.isVisited());
			if(!node.isVisited())
				bfsVisit(node);
		}
	}
	
	//BFS internal method
	void bfsVisit(GraphNode node) {
		
		LinkedList<GraphNode>queue = new LinkedList<>();
		
		// This is the first starting vertex that is added to the queue
		queue.add(node); //add source node to queue
		
		
		// Check whether the queue is empty
		while(!queue.isEmpty()) {
			// Dequeue the vertex from the queue
			GraphNode currentNode = queue.remove(0);
			// Change the state of the vertex to visited
			currentNode.setVisited(true);
			System.out.print(currentNode.getName() + " ");
			
			// for each neighbor (Adjacent vertices from the parent node) of present node
			for(GraphNode neighbor: currentNode.getNeighbors()) {
				System.out.println("\nName of the neighbor is: " + neighbor.getName() + "\t" + neighbor.getNeighbors());
				// if neighbor is not visited then add it to queue
				if(!neighbor.isVisited()) {
					queue.add(neighbor);
					neighbor.setVisited(true);
				}
			}
		}
	}
		
	// Add an undirected edge between two nodes
	public void addUndirectedEdge(int vertexOne, int vertexTwo) {
		GraphNode first = nodeList.get(vertexOne - 1);
		GraphNode second = nodeList.get(vertexTwo - 1);
		first.getNeighbors().add(second);//Neighbour of first is second. Store it.
		second.getNeighbors().add(first);//Neighbour of second is first. Store it.
		System.out.println(first.getNeighbors());
		System.out.println(second.getNeighbors());
	}
}
