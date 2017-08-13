package com.mtaylord.tree.binarytree;

import java.util.ArrayDeque;
import java.util.Deque;

public class PostOrderBinaryTreeIteratorSingleStack<T> extends BinaryTreeIterator<T> {

    private final Deque<BinaryTreeNode<T>> stack = new ArrayDeque<>();

    PostOrderBinaryTreeIteratorSingleStack(final BinaryTreeNode<T> current) {
        super(current);
        updateCurrent();
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public T next() {
        BinaryTreeNode<T> node = stack.pop();
        setCurrent(node);
        if (node.getRight() != null && node.getRight()
                                           .equals(stack.peek())) {
            setCurrent(stack.pop());
            stack.push(node);
            updateCurrent();
            next();
        }
        return getCurrent().getVal();
    }

    private void updateCurrent() {
        while (!isCurrentNull()) {
            if (getCurrent().getRight() != null) {
                stack.push(getCurrent().getRight());
            }
            stack.push(getCurrent());
            setCurrent(getCurrent().getLeft());
        }
    }

}
