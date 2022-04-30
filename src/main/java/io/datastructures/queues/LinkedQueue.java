package io.datastructures.queues;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class LinkedQueue<E> implements Queue<E>, Iterable<E> {

    private LinkedList<E> list = new LinkedList<>();

    public LinkedQueue() {

    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void enqueue(E elem) {
        list.addLast(elem);
    }

    public E dequeue() {
        return list.removeFirst();
    }

    public E peek() {
        return list.peekFirst();
    }

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }
}
