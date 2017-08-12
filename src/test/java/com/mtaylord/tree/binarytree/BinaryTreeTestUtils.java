package com.mtaylord.tree.binarytree;

public class BinaryTreeTestUtils {

    private BinaryTreeTestUtils() {
    }

    public static <T> BinaryTree<T> generateShallowBalancedBST(T rootVal, T leftVal, T rightVal) {
        BinaryTreeNode<T> root = new BinaryTreeNode<>(rootVal);
        root.setLeft(new BinaryTreeNode<>(leftVal));
        root.setRight(new BinaryTreeNode<>(rightVal));
        return new BinaryTree<>(root);
    }

    /**
     * 1
     * / \
     * 2  3
     * /\
     * 4 5
     *
     * @return
     */
    public static BinaryTree<Integer> generateBinaryTree() {
        BinaryTreeNode<Integer> root0 = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> left10 = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> right10 = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> left21 = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> right21 = new BinaryTreeNode<>();

        root0.setVal(1);
        left10.setVal(2);
        right10.setVal(3);

        left21.setVal(4);
        right21.setVal(5);

        root0.setLeft(left10);
        root0.setRight(right10);

        left10.setLeft(left21);
        left10.setRight(right21);

        return new BinaryTree<>(root0);
    }

}
