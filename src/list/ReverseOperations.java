/*
* You are given a singly-linked list that contains N integers. A subpart of the list is a contiguous set of even
* elements, bordered either by either end of the list or an odd element. For example,
* if the list is [1, 2, 8, 9, 12, 16], the subparts of the list are [2, 8] and [12, 16].
Then, for each subpart, the order of the elements is reversed. In the example,
* this would result in the new list, [1, 8, 2, 9, 16, 12].
* */

package list;

import java.util.ArrayList;
import java.util.List;

public class ReverseOperations {
    public static void main(String[] args) {
        int[] arr_1 = new int[]{1, 2, 8, 9, 12, 16};
        ReverseOperations reverseOperations = new ReverseOperations();
        Node root = reverseOperations.populateList(arr_1);
        traverse(root);
        if (root != null) {
            reverseOperations.reverse(root);
            System.out.println();
            traverse(root);
        }

        System.out.println(" ---------------------------------- ");
        int[] arr_2 = {2, 18, 24, 3, 5, 7, 9, 6, 12};
        root = reverseOperations.populateList(arr_2);
        traverse(root);
        if (root != null) {
            reverseOperations.reverse(root);
            System.out.println();
            traverse(root);
        }


    }

    private static void traverse(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }


    Node populateList(int[] arr) {
        Node current;
        Node previous = null;
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                current = new Node(arr[i]);
                root = current;
            } else {
                current = new Node(arr[i]);
                previous.next = current;
            }
            previous = current;
        }
        return root;
    }

    Node reverse(Node head) {
        boolean leftFixed = false;
        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.data % 2 != 0) {

                if (currentNode != head && !leftFixed) {
                    leftFixed = true;
                    Node start = head;
                    List<Node> list = new ArrayList<>();
                    getList(currentNode, start, list);

                    for (int i = list.size() - 1; i > 0; i--) {
                        swapOnLeft(list.get(i), list.get(i-1));
                        System.out.println();
                    }

                } else {
                    leftFixed = true;
                }


                while ((currentNode.next != null && currentNode.next.next != null)
                        && (currentNode.next.data % 2 == 0 && currentNode.next.next.data % 2 == 0)) {
                    Node left = currentNode;
                    Node right = currentNode.next;
                    swap(left, right);
                    currentNode = currentNode.next;
                }
            }
            currentNode = currentNode.next;
        }
        return head;

    }

    private void getList(Node currentNode, Node start, List<Node> list) {
        while (start != currentNode) {
            list.add(start);
            start = start.next;
        }
    }

    private void swapOnLeft(Node leftNode, Node rightNode) {
        int temp = rightNode.data;
        rightNode.data = leftNode.data;
        leftNode.data = temp;
    }

    private void swap(Node currentNode, Node leftNode) {
        Node rightNode = leftNode.next;
        leftNode.next = rightNode.next;
        rightNode.next = leftNode;
        currentNode.next = rightNode;
    }


    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }


}
