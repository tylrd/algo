package com.mtaylord.tree.binarytree;

public class BinaryTreeNode<T> {

    private BinaryTreeNode<T> left;
    private BinaryTreeNode<T> right;
    private T val;

    public BinaryTreeNode(final BinaryTreeNode<T> left, final BinaryTreeNode<T> right, final T val) {
        this.left = left;
        this.right = right;
        this.val = val;
    }

    public BinaryTreeNode(final T val) {
        this(null, null, val);
    }

    public BinaryTreeNode() {
    }

    public BinaryTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(final BinaryTreeNode<T> left) {
        this.left = left;
    }

    public BinaryTreeNode<T> getRight() {
        return right;
    }

    public void setRight(final BinaryTreeNode<T> right) {
        this.right = right;
    }

    public T getVal() {
        return val;
    }

    public void setVal(final T val) {
        this.val = val;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final BinaryTreeNode<?> node = (BinaryTreeNode<?>) o;

        if (left != null ? !left.equals(node.left) : node.left != null) {
            return false;
        }
        if (right != null ? !right.equals(node.right) : node.right != null) {
            return false;
        }
        return val != null ? val.equals(node.val) : node.val == null;
    }

    @Override
    public int hashCode() {
        int result = left != null ? left.hashCode() : 0;
        result = 31 * result + (right != null ? right.hashCode() : 0);
        result = 31 * result + (val != null ? val.hashCode() : 0);
        return result;
    }
}
