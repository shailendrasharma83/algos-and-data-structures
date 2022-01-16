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

    public void traversePreOrder() {
        if (!isNull(root)) {
            root.traversePreOrder();
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

            // If node to be deleted has 2 child
            subTreeNode.setData(subTreeNode.getRightChild().min());

            // or
            // subTreeNode.setData(subTreeNode.getLeftChild().max());

            //delete the node with the smallest value;
            subTreeNode.setRightChild(delete(subTreeNode.getRightChild(), subTreeNode.getData()));

            // or delete the node with the largest value;
            //subTreeNode.setLeftChild(delete(subTreeNode.getLeftChild(), subTreeNode.getData()));

        }
        return subTreeNode;
    }


    public int height() {
        return height(root);
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lHeight = height(root.getLeftChild());
        int rHeight = height(root.getRightChild());

        if (lHeight > rHeight) {
            return (lHeight + 1);
        } else {
            return (rHeight + 1);
        }
    }

    public void traverseInLevel() {
        if (root != null) {
            root.traverseLevelOrder();
        }

    }


}
