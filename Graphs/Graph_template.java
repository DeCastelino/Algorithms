package Graphs;

public interface Graph_template { // Graph class ADT
    // Initialize the graph with some number of vertices
    public void init(int n);
  
    // Return the number of vertices
    public int nodeCount();
  
    // Return the current number of edges
    public int edgeCount();
  
    // Get the value of node with index v
    public Object getValue(int v);
  
    // Set the value of node with index v
    public void setValue(int v, Object val);
    
    // Adds a new edge from node v to node w with weight wgt
    public void addEdge(int v, int w, int wgt);
  
    // Get the weight value for an edge
    public int weight(int v, int w);
  
    // Removes the edge from the graph.
    public void removeEdge(int v, int w);
  
    // Returns true iff the graph has the edge
    public boolean hasEdge(int v, int w);
  
    // Returns an array containing the indicies of the neighbors of v
    public int[] neighbors(int v);
  }