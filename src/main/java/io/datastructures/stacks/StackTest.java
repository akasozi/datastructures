package io.datastructures.stacks;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class StackTest {

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        System.out.println("initial size: " + stack.size());
        stack.push(5);
        System.out.println("size after adding 1 element: " + stack.size());
        int elem = stack.pop();
        System.out.println("size after removing 1 element: " + stack.size());
        System.out.println("is stack empty ? " + stack.isEmpty());
        stack.push(10);
        stack.push(11);
        System.out.println("size after adding 2 element: " + stack.size());
        System.out.println("top element: " + stack.peek());
        // int top = stack.peek();
    }
}
