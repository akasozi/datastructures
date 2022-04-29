package io.datastructures.stacks;

import io.datastructures.linkedlists.SinglyLinkedList;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class LinkedListStack<E> implements Stack<E> {

    private SinglyLinkedList<E> data;
    
    public LinkedListStack() {
        data = new SinglyLinkedList<>();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public void push(E elem) {
        data.addFirst(elem);
    }

    @Override
    public E peek() {
        return data.first();
    }

    @Override
    public E pop() {
        return data.removeFirst();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }
}
