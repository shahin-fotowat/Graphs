package bfs;
import java.util.ArrayList;
import node.*;

public class BFSByLinkedListMain {

	public static void main(String[] args) {
	
		//Initialize an Arraylist for storing all the graph nodes
		ArrayList<GraphNode> nodeList = new ArrayList<>();
		
		
		//create 10 nodes: v1-v10
		for(int i = 1; i < 11; i++) {
			nodeList.add(new GraphNode("V" + i));
			//System.out.println(nodeList.get(i-1).getName() + " - " + nodeList.get(i-1).getIndex() + " - " + 
			//				   nodeList.get(i-1).getParent() + " - " + nodeList.get(i-1).getNeighbors() + " - " +
			//				   nodeList.get(i-1).isVisited());
		}

		//Create the graph structure
		BFSByLinkedList graph = new BFSByLinkedList(nodeList);
		
		//add edges 
		//After this operation is complete, all the neighbor lists in 
		//each cell of nodeList will have their neighbors stored in them
		graph.addUndirectedEdge(1,2);
		graph.addUndirectedEdge(1,4);
		graph.addUndirectedEdge(2,3);
		graph.addUndirectedEdge(2,5);
		graph.addUndirectedEdge(3,6);
		graph.addUndirectedEdge(3,10);
		graph.addUndirectedEdge(4,7);
		graph.addUndirectedEdge(5,8);
		graph.addUndirectedEdge(6,9);
		graph.addUndirectedEdge(7,8);
		graph.addUndirectedEdge(8,9);
		graph.addUndirectedEdge(9,10);
	
		//bfs from v1
		System.out.println("Printing BFS from source: V1");
		graph.bfs();
		
	}
}
