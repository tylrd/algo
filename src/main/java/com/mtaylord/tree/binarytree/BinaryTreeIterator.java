package com.mtaylord.tree.binarytree;

import java.util.Iterator;
import java.util.Objects;

public abstract class BinaryTreeIterator<T> implements Iterator<T> {

    public static <T> Iterator<T> inOrderIterator(BinaryTree<T> binaryTree) {
        return new InOrderBinaryTreeIterator<>(binaryTree.getRoot());
    }

    public static <T> Iterator<T> postOrderIterator(BinaryTree<T> binaryTree) {
        return new PostOrderBinaryTreeIterator<>(binaryTree.getRoot());
    }

    public static <T> Iterator<T> preOrderIterator(BinaryTree<T> binaryTree) {
        return new PreOrderBinaryTreeIterator<>(binaryTree.getRoot());
    }

    private BinaryTreeNode<T> current;

    public BinaryTreeIterator(BinaryTreeNode<T> current) {
        this.current = current;
    }

    protected BinaryTreeNode<T> getCurrent() {
        return this.current;
    }

    public void setCurrent(final BinaryTreeNode<T> current) {
        this.current = current;
    }

    public boolean isCurrentNull() {
        return Objects.isNull(this.current);
    }

}
