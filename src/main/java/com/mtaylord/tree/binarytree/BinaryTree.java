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
            case PREORDER:
            case INORDER:
            default:
                iterator = new InOrderBinaryTreeIterator<>(root);
        }
        iterator.forEachRemaining(list::add);
        return list;
    }

    public BinaryTreeNode<T> getRoot() {
        return root;
    }

}
