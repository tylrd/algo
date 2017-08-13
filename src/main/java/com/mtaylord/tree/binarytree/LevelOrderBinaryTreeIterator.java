package com.mtaylord.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderBinaryTreeIterator<T> extends BinaryTreeIterator<T> {

    private Queue<BinaryTreeNode<T>> queue = new LinkedList<>();

    LevelOrderBinaryTreeIterator(final BinaryTreeNode<T> current) {
        super(current);
        queue.add(getCurrent());
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public T next() {
        BinaryTreeNode<T> node = queue.remove();
        if (node.getLeft() != null) {
            queue.add(node.getLeft());
        }
        if (node.getRight() != null) {
            queue.add(node.getRight());
        }
        return node.getVal();
    }

}
