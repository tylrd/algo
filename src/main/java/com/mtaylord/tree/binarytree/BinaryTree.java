package com.mtaylord.tree.binarytree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BinaryTree<T> {

    private BinaryTreeNode<T> root;

    public BinaryTree(final BinaryTreeNode<T> root) {
        this.root = root;
    }

    public List<T> traverse(TreeTraversal treeTraversal) {
        List<T> list = new ArrayList<>();
        Iterator<T> iterator;
        switch (treeTraversal) {
            case POSTORDER:
                iterator = BinaryTreeIterator.postOrderIterator(this);
                break;
            case PREORDER:
                iterator = BinaryTreeIterator.preOrderIterator(this);
                break;
            case INORDER:
                iterator = BinaryTreeIterator.inOrderIterator(this);
                break;
            default:
                iterator = BinaryTreeIterator.inOrderIterator(this);
        }
        iterator.forEachRemaining(list::add);
        return list;
    }

    public List<T> traverse() {
        return traverse(TreeTraversal.INORDER);
    }

    public BinaryTreeNode<T> getRoot() {
        return root;
    }

}
