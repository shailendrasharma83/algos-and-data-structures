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

    public void delete(int value) {

        root = delete(root, value);

    }

    private TreeNode delete(TreeNode subTreeNode, int value) {
        if (subTreeNode == null) {
            return subTreeNode;
        }

        if (value < subTreeNode.getData()) {
            subTreeNode.setLeftChild(delete(subTreeNode.getLeftChild(), value));
        } else if (value < subTreeNode.getData()) {
            subTreeNode.setRightChild(delete(subTreeNode.getRightChild(), value));
        } else {

            // If node to be deleted has 0 or 1 child
            if (subTreeNode.getLeftChild() == null) {
                return subTreeNode.getRightChild();
            } else if (subTreeNode.getRightChild() == null) {
                return subTreeNode.getLeftChild();
            }
        }
        return subTreeNode;
    }
}
