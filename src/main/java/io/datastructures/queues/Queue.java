package io.datastructures.queues;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public interface Queue<E> {

    public int size();

    public boolean isEmpty();

    public void enqueue(E elem);

    public E dequeue();

    public E peek();
}
