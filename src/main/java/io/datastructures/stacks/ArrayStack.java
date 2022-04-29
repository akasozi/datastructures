package io.datastructures.stacks;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class ArrayStack<E> implements Stack<E> {

    public static int CAPACITY = 1000;
    private int t = -1;
    private E[] data;

    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public ArrayStack() {
        this(CAPACITY);
    }

    @Override
    public int size() {
        return t + 1;
    }

    @Override
    public void push(E elem) throws IllegalStateException {
         if (size() == data.length)
             throw new IllegalStateException("Stack is full!");
         data[++t] = elem;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return data[t];
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E elem = data[t];
        data[t] = null;
        t--;
        return elem;
    }

    @Override
    public boolean isEmpty() {
        return t == -1;
    }
}
