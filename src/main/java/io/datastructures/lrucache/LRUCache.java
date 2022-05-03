package io.datastructures.lrucache;

import java.util.HashMap;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class LRUCache<T> {

    private final int capacity;
    private final HashMap<String, Node> hashMap;
    private final DoublyLinkedList internalQueue;

    private int size;

    public LRUCache(final int capacity) {
        this.capacity = capacity;
        this.hashMap = new HashMap<>();
        internalQueue = new DoublyLinkedList();
        this.size = 0;
    }
    /*
     * Everytime we access a node we move it to the front of the internal queue!
     */
    public T get(final String key) {
        Node node = hashMap.get(key);
        if (node == null) {
            return null;
        }
        internalQueue.moveNodeToFront(node);
        return hashMap.get(key).value;
    }


   /*
    * Everytime we access a node we move it to the front of the internal queue
    */
    public void put(final String key, final T value) {
       Node currentNode = hashMap.get(key);
       if (currentNode != null) {
           currentNode.value = value;
           internalQueue.moveNodeToFront(currentNode);
       }
       if (size == capacity) {
           String rearNodeKey = internalQueue.getRearKey();
           internalQueue.removeNodeFromRear();
           hashMap.remove(rearNodeKey);
           size--;
       }

       Node newNode = new Node(key, value);
       hashMap.put(key, newNode);
       internalQueue.insertNodeToFront(newNode);
       size++;
    }

    private class Node {
        String key;
        T value;
        Node next, prev;

        public Node(final String key, final T value) {
            this.key = key;
            this.value = value;
            this.next = this.prev = null;
        }
    }


    private class DoublyLinkedList {
        private Node head, tail;

        public DoublyLinkedList() {
            head = tail = null;
        }

        public void insertNodeToFront(final Node node) {
            if (tail == null) {
                head = tail = node;
                return;
            }
            node.next = head;
            head.prev = node;
            head = node;
        }

        public void moveNodeToFront(final Node node) {
             if (head == node) {
                 return;
             }

             if (node == tail) {
                tail = tail.prev;
                tail.next = null;
             } else {
                 node.prev.next = node.next;
                 node.next.prev = node.prev;
             }
             node.prev = null;
             node.next = head;
             head.prev = node;
             head = node;
        }

        public void removeNodeFromRear() {
             if (tail == null) {
                 return;
             }
             System.out.println("Deleting key: " + tail.key);

             if (head == tail) {
                  head = tail = null;
             }
             tail = tail.prev;
             tail.next = null;
        }

        private String getRearKey() {
            if (tail == null) {
                return null;
            }
            return tail.key;
        }

    }


}
