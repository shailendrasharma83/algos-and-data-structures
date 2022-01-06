package list;

public class InsertAtPositionInLinkedList {

    public static void main(String[] args) {
       testSinglyLinkedList();
       testCircularLinkedList();
    }

    private static void testSinglyLinkedList() {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insertAt(8, 4);
        list.printList();
    }

    private static void testCircularLinkedList() {
        CircularLinkedList list = new CircularLinkedList();list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.printList();
    }
}
