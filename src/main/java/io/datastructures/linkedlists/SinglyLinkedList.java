package io.datastructures.linkedlists;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class SinglyLinkedList<E> {

    private Node<E> head;

    private int length;

    public SinglyLinkedList() {

    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int size() {
        return length;
    }

    public E first() {
        if (size() == 0) {
            return null;
        }
        E elem = head.value;
        return elem;
    }

    public void printList() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public E removeFirst() {
        if (size() == 0) {
            return null;
        }
        if (size() == 1) {
            E elem = head.value;
            head = null;
            length--;
            return elem;
        }
        E elem = head.value;
        head = head.next;
        length--;
        return elem;
    }

    public E removeAt(int index) throws IllegalStateException {

        if (index < 0 || index >= size()) {
            throw new IllegalStateException("Invalid index: " + index);
        }
        if (index == 0) {
            E elem = removeFirst();
            return elem;
        }
        Node<E> temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        E elem = temp.next.value;
        temp.next = temp.next.next;
        length--;
        return elem;
    }

    public E removeLast() {
        if (size() == 0) {
            return null;
        }
        if (size() == 1) {
            E elem = head.value;
            head = null;
            length--;
            return elem;
        }
        Node<E> temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        E elem = temp.next.value;
        temp.next = null;
        length--;
        return elem;
    }


    public void addFirst(E value) {
        Node<E> newNode = new Node<>(value, null);
        if (size() == 0) {
            head = newNode;
            length++;
            return;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void addLast(E value) {
        if (size() == 0) {
            addFirst(value);
            return;
        }
        Node<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node<E> newNode = new Node<>(value, null);
        temp.next = newNode;
        length++;
    }

    public void addAt(E value, int index) throws IllegalStateException {
        if (index < 0 || index >= size()) {
            throw new IllegalStateException("Invalid index value: " + index);
        }
        if (index == 0) {
            addFirst(value);
            return;
        }

        Node<E> temp = head;
        for (int i = 0; i < index -1; i++) {
            temp = temp.next;
        }
        Node<E> newNode = new Node<>(value, null);
        Node<E> nextNode = temp.next;
        temp.next = newNode;
        newNode.next = nextNode;
        length++;
    }

    private static class Node<E> {
        public E value;
        public Node<E> next;

        public Node (E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }
}
