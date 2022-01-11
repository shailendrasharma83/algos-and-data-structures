package list;

import java.util.Objects;

public class SingleLinkedList<T> {
    Node head;
    Node tail;
    int length = 0;

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

    public void insert(T value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }

        tail = newNode;
        this.length++;
    }

    public void insertAt(int position, T value) {
        Node newNode = new Node(value);

        if (Objects.isNull(head)) {
            head = newNode;
            tail = newNode;
        } else {
            Node node = head.next;
            int counter = 0;
            Node temp;
            while (counter != position) {
                counter++;

                if (node.equals(tail)) {
                    temp = new Node(0);
                    tail.next = temp;
                    tail = temp;
                } else {
                    node = node.next;
                }
            }
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void delete(T value) {

        if (head == null) {
            return;
        }

        if (head.value == value) {
            head = head.next;
            return;
        }

        Node node = head.next;
        Node prev = head;

        while (node != null) {
            if (node.value == value) {
                prev.next = node.next;
                return;
            }
            node = node.next;
        }
    }

    public void reverse() {
      Node current = head;
      Node prev = null;
      Node next = null;

      while(current != null) {
          next = current.next;
          current.next = prev;
          prev = current;
          current = next;
      }
      head = prev;
    }


    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.value + " ");
            n = n.next;
        }
    }
}
