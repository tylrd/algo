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
     *     1
     *    / \
     *   2  3
     *  / \
     * 4  5
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

    public static BinaryTree<Integer> generateDeepBinaryTree() {
        BinaryTreeNode<Integer> root0 = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> leftA = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> rightB = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> leftAA = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> rightAA = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> leftBB = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> rightBB = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> leftBBB = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> rightAAA = new BinaryTreeNode<>();

        root0.setVal(1);
        leftA.setVal(2);
        rightB.setVal(3);

        leftAA.setVal(4);
        rightAA.setVal(5);

        leftBB.setVal(6);
        rightBB.setVal(7);

        leftBBB.setVal(8);
        rightAAA.setVal(9);

        root0.setLeft(leftA);
        root0.setRight(rightB);

        leftA.setLeft(leftAA);
        leftA.setRight(rightAA);

        rightAA.setRight(rightAAA);

        rightB.setLeft(leftBB);
        rightB.setRight(rightBB);

        leftBB.setLeft(leftBBB);
        return new BinaryTree<>(root0);
    }

}
