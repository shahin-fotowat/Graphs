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

Topological sorting for Directed Acyclic Graph (DAG) is a linear ordering of vertices such that for every directed edge uv, vertex u comes before v in the ordering. Topological Sorting for a graph is not possible if the graph is not a Directed acyclic graph
