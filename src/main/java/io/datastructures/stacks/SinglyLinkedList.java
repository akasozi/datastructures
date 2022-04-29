package io.datastructures.stacks;

import org.springframework.lang.NonNull;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class SinglyLinkedList<E> {

    public Node<E> head = null;
    public Node<E> tail = null;
    public int size = 0;

    public SinglyLinkedList() {

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        E data = head.element;
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }
        return data;
    }

    public void addFirst(E e) {
        Node<E> newestNode = new Node<>(e, null);
        newestNode.next = head;
        head = newestNode;
        size++;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e, null);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    private static class Node<E> {
         public E element;
         public Node<E> next;

         public Node(E element, Node<E> next) {
             this.element = element;
             this.next = next;
         }
    }
}
