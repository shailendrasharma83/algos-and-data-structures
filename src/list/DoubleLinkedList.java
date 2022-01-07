package list;

public class DoubleLinkedList<T> {
    private Node head;
    private Node tail;
    private int length = 0;

    static class Node<T> {
        Node next;
        Node prev;
        T value;

        public Node(T value) {
            this.value = value;
        }
    }

    public int length() {
        return this.length;
    }

    public void addNode(int value) {
        length++;

        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
    }

    public void addNodeAt(int pos, int value) {

        Node newNode = new Node(value);
        int counter = 0;

        Node node = head;
        while (counter != pos) {
            counter++;
            if (node == null) {
                addNode(0);
            } else {
                node = node.next;
            }
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void printList() {
        Node n = this.head;
        while (n != null) {
            System.out.print(n.value + " ");
            n = n.next;
        }
    }
}
