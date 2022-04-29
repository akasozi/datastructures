package io.datastructures.queues;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public interface Queue<E> {
    int size();
    boolean isEmpty();
    void enqueue(E elem);
    E dequeue();
    E peek();
}
