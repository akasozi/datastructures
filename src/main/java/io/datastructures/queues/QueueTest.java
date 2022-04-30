package io.datastructures.queues;

import java.util.Iterator;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class QueueTest {

    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        queue.enqueue(0);
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty(): " + queue.isEmpty());
        Iterator<Integer> iter = queue.iterator();
        while(iter.hasNext()) {
            System.out.print(" " + iter.next());
        }
        System.out.println();
        queue.dequeue();
        //queue.dequeue();
        iter = queue.iterator();
        while(iter.hasNext()) {
            System.out.print(" " + iter.next());
        }
    }


}
