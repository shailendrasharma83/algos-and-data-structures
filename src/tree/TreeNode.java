package tree;

import static java.util.Objects.isNull;

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    @Override
    public String toString() {
        return "Data = " + this.data;
    }

    public TreeNode(int data) {
        this.data = data;

    }

    public void insert(int value) {
        if (value == this.data) {
            return;
        }

        if (value < this.data) {
            if (isNull(this.leftChild)) {
                this.leftChild = new TreeNode(value);
            } else {
                this.leftChild.insert(value);
            }
        }

        if (value > this.data) {
            if (isNull(this.rightChild)) {
                this.rightChild = new TreeNode(value);
            } else {
                this.rightChild.insert(value);
            }
        }
    }

    public void traverseInOrder() {
        if (this.leftChild != null) {
            this.leftChild.traverseInOrder();
        }

        System.out.print(this.data + ",");

        if (this.rightChild != null) {
            this.rightChild.traverseInOrder();
        }
    }

    public TreeNode get(int value) {
        if (this.data == value) {
            return this;
        }

        if (value < this.data) {
            if (this.leftChild != null) {
                return this.leftChild.get(value);
            }
        }
        if (this.rightChild != null) {
            return this.rightChild.get(value);
        }
        return null;
    }

    public int min() {
        if (this.leftChild == null) {
            return this.data;
        }
        return this.leftChild.min();
    }

    public int max() {
        if (this.rightChild == null) {
            return this.data;
        }
        return this.rightChild.max();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

}
