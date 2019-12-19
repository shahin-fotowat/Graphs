package bfs;

import java.util.ArrayList;
import java.util.Scanner;  
import node.GraphNode;

public class PathFindingByBFSMain {

	

	public static void main(String[] args) {
		
		ArrayList<GraphNode> nodeList = new ArrayList<>();

		//create 10 vertices: v1-v10
		for(int i = 0;i < 10; i++) {
			nodeList.add(new GraphNode("" + i));
		}
		
		PathFindingByBFS graph = new PathFindingByBFS(nodeList);
		
		//add edges following graph in graph.docx
		graph.addUndirectedEdge(0,8);
		graph.addUndirectedEdge(8,2);
		graph.addUndirectedEdge(8,9);
		graph.addUndirectedEdge(2,1);
		graph.addUndirectedEdge(9,1);
		graph.addUndirectedEdge(2,4);
		graph.addUndirectedEdge(1,3);
		graph.addUndirectedEdge(1,7);
		graph.addUndirectedEdge(3,4);
		graph.addUndirectedEdge(3,5);
		graph.addUndirectedEdge(7,6);
		graph.addUndirectedEdge(5,6);

		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter the Vertex you wish to start from: ");
		int input_vertex = in.nextInt();
		System.out.println();
		System.out.println("Printing BFS from source: " + input_vertex);
		graph.BFSForSSSP(nodeList.get(input_vertex));
	}//end of method

}//end of class
