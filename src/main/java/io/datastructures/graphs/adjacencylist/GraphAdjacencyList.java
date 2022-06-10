package io.datastructures.graphs.adjacencylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class GraphAdjacencyList {

    private List<GraphNode> nodeList = new ArrayList<>();

    public GraphAdjacencyList(List<GraphNode> nodeList) {
          this.nodeList = nodeList;
    }

    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));

        GraphAdjacencyList myGraph = new GraphAdjacencyList(nodeList);
        myGraph.addUndirectedEdge(0, 1);
        myGraph.addUndirectedEdge(0, 2);
        myGraph.addUndirectedEdge(0, 3);
        myGraph.addUndirectedEdge(1, 4);
        myGraph.addUndirectedEdge(2, 3);
        myGraph.addUndirectedEdge(3, 4);

        System.out.println(myGraph.toString());
    }

    public void addUndirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + ": ");
            for (int j =0; j < nodeList.get(i).neighbors.size(); j++) {
                if (j == nodeList.get(i).neighbors.size()-1 ) {
                    s.append((nodeList.get(i).neighbors.get(j).name) );
                } else {
                    s.append((nodeList.get(i).neighbors.get(j).name) + " -> ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }
}
