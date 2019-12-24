# Graphs

In this Project the code for BFS/DFS search in a graph has been included
Below are the three format that the code has been written.

Breadth First Search is a vertex based technique for finding a shortest path in graph. It uses a Queue data structure which follows first in first out. In BFS, one vertex is selected at a time when it is visited and marked then its adjacent are visited and stored in the queue.

- BFS By Adjacency Matrix
  - In this file Adjacency matrix has been used to find all the vertices of a graph using BFS
- BFS By LinkedList
  - In this file Adjancency list has been used to find all the vertices of a graph using BFS
- PathFindingByBFS
 -------------------------------------------------------------------------------------------
 
Depth First Search is a edge based technique. It uses the Stack data structure, performs two stages, first visited vertices are pushed into stack and second if there is no vertices then visited vertices are popped. 
 
- DFSIterative
- DFSRecursive

 -------------------------------------------------------------------------------------------
- TopologicalSort 

Topological sorting for Directed Acyclic Graph (DAG) is a linear ordering of vertices such that for every directed edge uv, vertex u comes before v in the ordering. Topological Sorting for a graph is not possible if the graph is not a Directed acyclic graph

- TopologicalSort

 -------------------------------------------------------------------------------------------
- Dijkstra 

Given a graph and a source vertex in the graph, find shortest paths from source to all vertices in the given graph.
Dijkstra’s algorithm is very similar to Prim’s algorithm for minimum spanning tree. Like Prim’s MST, we generate a SPT (shortest path tree) with given source as root. We maintain two sets, one set contains vertices included in shortest path tree, other set includes vertices not yet included in shortest path tree. At every step of the algorithm, we find a vertex which is in the other set (set of not yet included) and has a minimum distance from the source.

- PathFindingByDijkstra
