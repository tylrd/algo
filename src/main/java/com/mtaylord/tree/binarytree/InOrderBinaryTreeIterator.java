package com.mtaylord.tree.binarytree;

import java.util.ArrayDeque;
import java.util.Deque;

public class InOrderBinaryTreeIterator<T> extends BinaryTreeIterator<T> {

    private final Deque<BinaryTreeNode<T>> stack = new ArrayDeque<>();

    public InOrderBinaryTreeIterator(final BinaryTreeNode<T> current) {
        super(current);
        updateCurrent();
    }

    @Override
    public boolean hasNext() {
        return isCurrentNull() && !stack.isEmpty();
    }

    @Override
    public T next() {
        BinaryTreeNode<T> node = stack.pop();
        setCurrent(node.getRight());
        updateCurrent();
        return node.getVal();
    }

    private void updateCurrent() {
        while (!isCurrentNull()) {
            stack.push(getCurrent());
            setCurrent(this.getCurrent().getLeft());
        }
    }

}

