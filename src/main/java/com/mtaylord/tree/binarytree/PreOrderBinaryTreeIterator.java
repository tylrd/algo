package com.mtaylord.tree.binarytree;

import java.util.ArrayDeque;
import java.util.Deque;

public class PreOrderBinaryTreeIterator<T> extends BinaryTreeIterator<T> {

    private final Deque<BinaryTreeNode<T>> stack = new ArrayDeque<>();

    public PreOrderBinaryTreeIterator(final BinaryTreeNode<T> current) {
        super(current);
        stack.push(current);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public T next() {
        BinaryTreeNode<T> node = stack.pop();
        if (node.getRight() != null) {
            stack.push(node.getRight());
        }
        if (node.getLeft() != null) {
            stack.push(node.getLeft());
        }
        return node.getVal();
    }

}
