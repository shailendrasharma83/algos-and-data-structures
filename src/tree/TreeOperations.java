package tree;

public class TreeOperations {

    public static void main(String[] args) {
        int[] arr = new int[]{25, 20, 15, 27, 30, 29, 26, 22, 32};

        Tree bTree = new Tree();

        for (int item : arr) {
            bTree.insert(item);
        }

        bTree.traverseInOrder();
        System.out.println();

        bTree.insert(28);

        bTree.traverseInOrder();
        System.out.println();

        bTree.insert(16);

        bTree.traverseInOrder();
        System.out.println();
        bTree.traversePreOrder();

        System.out.println(bTree.get(15));
        System.out.println(bTree.get(30));
        System.out.println(bTree.get(111));

        System.out.println("Min Value :: " + bTree.min());
        System.out.println("Max Value :: " + bTree.max());

        bTree.delete(15);
        System.out.println();
        bTree.traverseInOrder();
        System.out.println();
        System.out.println("Min Value :: " + bTree.min());
    }
}
