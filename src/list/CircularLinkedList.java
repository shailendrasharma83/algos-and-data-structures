package list;

import static java.util.Objects.isNull;

public class CircularLinkedList<T> {

    Node head;
    Node tail;
    int length;

    static class Node<T> {
        T value;
        Node next;

        public Node(T value) {
            this.value = value;
        }
    }

    public int length() {
        return this.length;
    }

    public void addNode(T value) {
        Node newNode = new Node(value);

        if (isNull(head)) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        tail.next = head;
        length++;
    }

    public void addNode(int position, T value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        }

        int counter = 0 ;
        Node emptyNode;
        Node node = head;
        while (counter != position) {
            counter++;

        }
    }

    public void printList() {
        Node n = head;
        do {
            System.out.print(n.value + " ");
            n = n.next;
        } while (n != head);
    }
}