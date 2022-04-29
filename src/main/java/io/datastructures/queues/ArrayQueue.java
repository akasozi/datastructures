package io.datastructures.queues;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class ArrayQueue<E> implements Queue<E> {

    public static int CAPACITY = 1000;
    private E[] data;
    private int f = 0; // index of the front element
    private int sz = 0; // current no. of elements

    public ArrayQueue(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public ArrayQueue() {
        this(CAPACITY);
    }

    public int size() {
        return sz;
    }

    public boolean isEmpty() {
        return sz==0;
    }

    public void enqueue(E elem) throws IllegalStateException {
        if (size() >= data.length) {
            throw new IllegalStateException("Queue is full");
        }
        int avail = (f + sz) % data.length;
        data[avail] = elem;
        sz++;
    }

    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        E elem = data[f];
        data[f] = null;
        f = (f + 1) % data.length;
        sz--;
        return elem;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return data[f];
    }
}
