package io.datastructures.graphs.adjacencylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class GraphNode {

    public final String name;
    public final int index;
    public final List<GraphNode> neighbors;

    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
        this.neighbors = new ArrayList<GraphNode>();
    }



}
