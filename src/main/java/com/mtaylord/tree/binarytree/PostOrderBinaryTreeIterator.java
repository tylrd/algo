package com.mtaylord.tree.binarytree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Post order traversal for a binary tree
 *
 * Visits left, right, then root branch of binary tree
 *
 * @param <T>
 */
public class PostOrderBinaryTreeIterator<T> extends BinaryTreeIterator<T> {

    private final Deque<BinaryTreeNode<T>> stack1 = new LinkedList<>();
    private final Deque<BinaryTreeNode<T>> stack2 = new LinkedList<>();


    public PostOrderBinaryTreeIterator(final BinaryTreeNode<T> current) {
        super(current);
        stack1.push(current);
        while (!stack1.isEmpty()) {
            BinaryTreeNode<T> node = stack1.pop();
            stack2.push(node);
            if (node.getLeft() != null) {
                stack1.push(node.getLeft());
            }
            if (node.getRight() != null) {
                stack1.push(node.getRight());
            }
        }
    }

    @Override
    public boolean hasNext() {
        return !stack2.isEmpty();
    }

    @Override
    public T next() {
        BinaryTreeNode<T> node = stack2.pop();
        return node != null ? node.getVal() : null;
    }
}
