package io.datastructures.graphs.adjacencymatrix;

import java.util.ArrayList;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class GraphAdjacencyMatrix {

     private final ArrayList<GraphNode> nodeList;
     private final int[][] adjacencyMatrix;

     public static void main(String[] args) {
         ArrayList<GraphNode> nodeList = new ArrayList<>();
         nodeList.add(new GraphNode("A", 0));
         nodeList.add(new GraphNode("B", 1));
         nodeList.add(new GraphNode("C", 2));
         nodeList.add(new GraphNode("D", 3));
         nodeList.add(new GraphNode("E", 4));

         GraphAdjacencyMatrix myGraph = new GraphAdjacencyMatrix(nodeList);
         myGraph.addUndirectedEdge(0,1);
         myGraph.addUndirectedEdge(0,2);
         myGraph.addUndirectedEdge(0,3);
         myGraph.addUndirectedEdge(1,4);
         myGraph.addUndirectedEdge(2,3);
         myGraph.addUndirectedEdge(3,4);
         System.out.println(myGraph.toString());
     }

     public GraphAdjacencyMatrix(final ArrayList<GraphNode> nodeList) {
         this.nodeList = nodeList;
         this.adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
     }

     public void addUndirectedEdge(int i, int j) {
         this.adjacencyMatrix[i][j] = 1;
         this.adjacencyMatrix[j][i] = 1;
     }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + " ");
        }
        s.append("\n");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + ": ");
            for (int j : adjacencyMatrix[i]) {
                s.append((j) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}
