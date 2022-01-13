package tree;

import static java.util.Objects.isNull;

public class Tree {
    TreeNode root;


    public void insert(int item) {
        if (!isNull(root)) {
            root.insert(item);
            return;
        }
        root = new TreeNode(item);
    }

    public void traverseInOrder() {
        if (!isNull(root)) {
            root.traverseInOrder();
        }
    }

    public TreeNode get(int value) {
        if (!isNull(root)) {
            return root.get(value);
        }
        return null;
    }

    public int min() {
        if (!isNull(root)) {
            return root.min();
        }
        return Integer.MIN_VALUE;
    }

    public int max() {
        if (!isNull(root)) {
            return root.max();
        }
        return Integer.MAX_VALUE;
    }
}
