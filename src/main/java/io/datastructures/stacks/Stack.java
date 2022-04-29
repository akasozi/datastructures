package io.datastructures.stacks;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public interface Stack<E> {
    int size();
    void push(E elem);
    E peek();
    E pop();
    boolean isEmpty();
}
