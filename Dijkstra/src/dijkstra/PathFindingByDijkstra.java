package dijkstra;
import java.util.*;

import node.*;

public class PathFindingByDijkstra {
	ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();
	
	//Constructor
	public PathFindingByDijkstra(ArrayList<WeightedNode> nodeList) {
		this.nodeList = nodeList;
	}
	
	//Dijkstra from a Source Node
	void dijkstra(WeightedNode node) { 
		
		// Min-Heap where the smallest weight in the front of the priority queue 
		PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
		
		//This will make sure that the distance of the starting vertex passed to the dijkstra
		// method is 0 (min)
		node.setDistance(0); 
		queue.addAll(nodeList);
		
		while(!queue.isEmpty()) {
			// remove node with minimum distance from queue
			WeightedNode currentNode = queue.remove(); 
			
			// for each neighbor
			for(WeightedNode neighbor: currentNode.getNeighbors()) { 
				// if neighbor is not visited
				if(queue.contains(neighbor)) { 
					// if 'known distance' of neighbor is greater than new path then, update 'distance' of neighbor 
					// and also new parent as currentNode
					if(neighbor.getDistance() > (currentNode.getDistance() + currentNode.getWeightMap().get(neighbor))) {
						neighbor.setDistance((currentNode.getDistance() + currentNode.getWeightMap().get(neighbor)));
						neighbor.setParent(currentNode);
						
						//Refresh the Priority Queue 
						queue.remove(neighbor);
						queue.add(neighbor);
					}//end of if block
				}//end of if block
			}//end of for loop
		}//end of while loop
		
		
		//print table of node with minimum distance and shortest path from source
		for(WeightedNode nodeToCheck: nodeList) {
			System.out.print("Node " + nodeToCheck + ", distance: " + nodeToCheck.getDistance() + ", Path: ");
			pathPrint(nodeToCheck);
			System.out.println();
		}
	}//end of method
	
	
	private static void pathPrint(WeightedNode node) {
		if(node.getParent() != null) {
			pathPrint(node.getParent());
			System.out.print("->" + node);
		}
		else 
			System.out.print(node);
	}//end of method

	
	// add a weighted directed edge between two nodes
	public void addWeightedEdge(int v1, int v2, int dist) {
		WeightedNode first_vertex  = nodeList.get(v1 - 1);
		WeightedNode second_vertex = nodeList.get(v2 - 1);
		//Adds the second vertex as the neighbor of the first vertex
		first_vertex.getNeighbors().add(second_vertex);
		//using a hashmap it stores the weight of the edge between the two vertices
		first_vertex.getWeightMap().put(second_vertex, dist);
	}//end of method

}//end of class



