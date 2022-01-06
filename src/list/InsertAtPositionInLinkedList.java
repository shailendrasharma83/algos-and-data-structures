package list;

public class InsertAtPositionInLinkedList {

    public static void main(String[] args) {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insertAt(8, 4);

        list.printList();
    }
}
