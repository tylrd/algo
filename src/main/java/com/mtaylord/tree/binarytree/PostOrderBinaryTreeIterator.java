package com.mtaylord.tree.binarytree;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Post order traversal for a binary tree
 *
 * Visits left, right, then root branch of binary tree
 *
 * @param <T>
 */
public class PostOrderBinaryTreeIterator<T> extends BinaryTreeIterator<T> {

    private final Deque<BinaryTreeNode<T>> stack = new ArrayDeque<>();

    PostOrderBinaryTreeIterator(final BinaryTreeNode<T> current) {
        super(current);
        final Deque<BinaryTreeNode<T>> tempStack = new ArrayDeque<>();
        tempStack.push(current);
        while (!tempStack.isEmpty()) {
            BinaryTreeNode<T> node = tempStack.pop();
            stack.push(node);
            if (node.getLeft() != null) {
                tempStack.push(node.getLeft());
            }
            if (node.getRight() != null) {
                tempStack.push(node.getRight());
            }
        }
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public T next() {
        BinaryTreeNode<T> node = stack.pop();
        return node != null ? node.getVal() : null;
    }
}
