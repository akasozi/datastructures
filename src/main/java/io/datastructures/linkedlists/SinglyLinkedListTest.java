package io.datastructures.linkedlists;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.addFirst(1);
        singlyLinkedList.addFirst(2);
        singlyLinkedList.addFirst(3);
        singlyLinkedList.addFirst(4);
        singlyLinkedList.addFirst(5);
        singlyLinkedList.addLast(0);
        singlyLinkedList.addAt(7, 2);
        singlyLinkedList.printList();
        System.out.println();
        singlyLinkedList.removeFirst();
        singlyLinkedList.printList();
        System.out.println();
        singlyLinkedList.removeLast();
        singlyLinkedList.printList();
        System.out.println();
        singlyLinkedList.removeAt(1);
        singlyLinkedList.printList();
        System.out.println();
        singlyLinkedList.removeLast();
        singlyLinkedList.printList();
        System.out.println();
    }
}
