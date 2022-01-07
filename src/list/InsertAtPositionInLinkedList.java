package list;

import java.util.HashSet;

public class InsertAtPositionInLinkedList {

    public static void main(String[] args) {
        testSinglyLinkedList();
        testCircularLinkedList();
        testDoublyLinkedList();
        detectCycle();
    }

    private static void detectCycle() {
        CircularLinkedList list = new CircularLinkedList();
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        CircularLinkedList.Node node = list.head;
        HashSet set = new HashSet();
        while (node != null) {
            if (set.contains(node)) {
                System.out.println("Cycle Detected");
                break;
            }
            set.add(node);
            node = node.next;
        }
    }

    private static void testDoublyLinkedList() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addNode(4);
        list.addNode(6);
        list.addNode(9);
        list.addNode(10);
        System.out.println("\n------------Insert Into Double link list--------------");
        list.printList();
        list.addNodeAt(6, 22);
        System.out.println("\n------------Insert--------------");
        list.printList();
    }

    private static void testSinglyLinkedList() {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insertAt(8, 4);
        list.printList();
        list.delete(2);
        System.out.println("\n------------Delete--------------");
        list.printList();
        list.insert(2);
        System.out.println("\n------------Insert--------------");
        list.printList();
    }

    private static void testCircularLinkedList() {
        CircularLinkedList list = new CircularLinkedList();
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.printList();
    }
}
