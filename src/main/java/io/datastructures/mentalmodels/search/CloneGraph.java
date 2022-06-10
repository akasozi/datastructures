package io.datastructures.mentalmodels.search;

import java.util.*;

/**
 * Return a clone (deep copy) of a directed graph
 * use BFS to traverse level by level
 */
public class CloneGraph {

    private static class Node {
        public int val;
        public List<Node> neighbors;

        public Node () {
            val = 0;
            neighbors = new ArrayList<>();
        }

        public Node (int val) {
            this.val = val;
            neighbors = new ArrayList<>();
        }

        public Node(int val, ArrayList<Node> neighbors) {
            this.val = val;
            this.neighbors = neighbors;
        }
    }

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Map<Node, Node> hashMap = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        hashMap.put(node, new Node(node.val));
        while (!queue.isEmpty()) {
            Node first = queue.remove();
            Node firstClone = hashMap.get(first);
            for (Node cur : first.neighbors) {
                Node curClone;
                if (hashMap.containsKey(cur)) {
                    curClone = hashMap.get(cur);
                } else {
                    queue.add(cur);
                    curClone = new Node(cur.val);
                    hashMap.put(cur, curClone);
                }
                firstClone.neighbors.add(curClone);
            }
        }
        return hashMap.get(node);
    }


}
