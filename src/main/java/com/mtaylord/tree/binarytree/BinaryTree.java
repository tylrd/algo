package com.mtaylord.tree.binarytree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BinaryTree<T> {

    private BinaryTreeNode<T> root;

    public BinaryTree(final BinaryTreeNode<T> root) {
        this.root = root;
    }

    public List<T> traverse(TraversalOrder order) {
        final List<T> list = new ArrayList<>();
        Iterator<T> iterator;
        switch (order) {
            case POST:
                iterator = BinaryTreeIterator.postOrderIterator(this);
                break;
            case PRE:
                iterator = BinaryTreeIterator.preOrderIterator(this);
                break;
            case IN:
                iterator = BinaryTreeIterator.inOrderIterator(this);
                break;
            case LEVEL:
                iterator = BinaryTreeIterator.levelOrderIterator(this);
                break;
            default:
                iterator = BinaryTreeIterator.inOrderIterator(this);
        }
        iterator.forEachRemaining(list::add);
        return list;
    }

    public List<T> traverse() {
        return traverse(TraversalOrder.IN);
    }

    public BinaryTreeNode<T> getRoot() {
        return root;
    }

}
