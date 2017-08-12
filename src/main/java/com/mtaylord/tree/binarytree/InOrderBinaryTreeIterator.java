package com.mtaylord.tree.binarytree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class InOrderBinaryTreeIterator<T> implements Iterator<T> {

    private final Deque<BinaryTreeNode<T>> deque = new ArrayDeque<>();
    private BinaryTreeNode<T> current;

    public InOrderBinaryTreeIterator(BinaryTreeNode<T> current) {
        this.current = current;
        updateCurrent();
    }

    @Override
    public boolean hasNext() {
        return this.current == null && !deque.isEmpty();
    }

    @Override
    public T next() {
        BinaryTreeNode<T> node = deque.pop();
        this.current = node.getRight();
        updateCurrent();
        return node.getVal();
    }

    private void updateCurrent() {
        while (this.current != null) {
            deque.push(current);
            this.current = this.current.getLeft();
        }
    }

}

