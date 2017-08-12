package com.mtaylord.tree.binarytree;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class BinaryTreeTest {

    @Test
    public void testBSTcontruction() throws Exception {
        assertNotNull(BinaryTreeTestUtils.generateShallowBalancedBST(1, 2, 3));
    }

    @Test
    public void inorderIterator() throws Exception {
        BinaryTree<Integer> binaryTree = BinaryTreeTestUtils.generateShallowBalancedBST(1, 2, 3);
        Iterator<Integer> iterator = new InOrderBinaryTreeIterator<>(binaryTree.getRoot());

        assertTrue(iterator.hasNext());

        Integer first = iterator.next();
        assertEquals(new Integer(2), first);

        assertTrue(iterator.hasNext());

        Integer second = iterator.next();
        assertEquals(new Integer(1), second);

        assertTrue(iterator.hasNext());

        Integer third = iterator.next();
        assertEquals(new Integer(3), third);

        assertFalse(iterator.hasNext());
    }

    @Test
    public void inOrderIterator_toString() throws Exception {
        BinaryTree<Integer> binaryTree = BinaryTreeTestUtils.generateBinaryTree();
        assertEquals(binaryTree.traverse(TreeTraversal.INORDER), Arrays.asList(4, 2, 5, 1, 3));
    }

}