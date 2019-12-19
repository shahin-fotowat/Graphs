package bfs;
import java.util.ArrayList;
import java.util.LinkedList;
import node.GraphNode;

public class PathFindingByBFS {
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	
	//Constructor
	public PathFindingByBFS(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}
	
	//Print path of each of the vertex from source
	public static void pathPrint(GraphNode node) {
		if(node.getParent() != null)
			pathPrint(node.getParent());  //recursive call to parent
		System.out.print(node + " ");
	}
	
	//BFS Traversal by a source node
	void BFSForSSSP(GraphNode node) {
		// Create a queue for the vetices
		LinkedList<GraphNode> queue = new LinkedList<>();
		// add source node to queue
		queue.add(node);  
		
		// Iterate over the queue and enqueue and dequeue the vertices 
		// inorder to find optimal path
		while(!queue.isEmpty()) {
			GraphNode currentNode = queue.remove(0);
			//if(!currentNode.isVisited()) 
			currentNode.setVisited(true);
			if(currentNode.getParent() != null) {
				System.out.print("Parent of " +  currentNode.getName() + 
								  " is: " +  currentNode.getParent().getName() + 
								  " ... Printing path for node " + currentNode.getName() + ": ");
			} else {
				System.out.print("Printing path for node " + currentNode.getName() + ": ");
			}
			pathPrint(currentNode);
			System.out.println();
			// for each neighbor of current node
			for(GraphNode neighbor: currentNode.getNeighbors()) { 
				if(!neighbor.isVisited()) {
					queue.add(neighbor);
					neighbor.setVisited(true);
					neighbor.setParent(currentNode);
				}//end of if
			}//end of for loop
		}//end of while loop
	}
	
	// add an undirected edge between two vertices
	public void addUndirectedEdge(int i, int j) {
		GraphNode first_vertex  = nodeList.get(i);
		GraphNode second_vertex = nodeList.get(j);
		first_vertex.getNeighbors().add(second_vertex);
		second_vertex.getNeighbors().add(first_vertex);
	}

}//end of class