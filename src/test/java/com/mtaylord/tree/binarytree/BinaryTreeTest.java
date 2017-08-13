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
        Iterator<Integer> iterator = BinaryTreeIterator.inOrderIterator(binaryTree);

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
    public void traverseInOrder() throws Exception {
        BinaryTree<Integer> binaryTree = BinaryTreeTestUtils.generateBinaryTree();
        assertEquals(binaryTree.traverse(TraversalOrder.IN), Arrays.asList(4, 2, 5, 1, 3));
    }

    @Test
    public void postOrderIterator_doubleStack() throws Exception {
        Iterator<Integer> iterator = BinaryTreeIterator.postOrderIterator(BinaryTreeTestUtils.generateBinaryTree());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(4), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(5), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(2), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(3), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(1), iterator.next());

        assertFalse(iterator.hasNext());
    }

    @Test
    public void postOrderIterator_singleStack() throws Exception {
        Iterator<Integer> iterator = new PostOrderBinaryTreeIteratorSingleStack<>(
                BinaryTreeTestUtils.generateBinaryTree()
                                   .getRoot());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(4), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(5), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(2), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(3), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(1), iterator.next());

        assertFalse(iterator.hasNext());
    }

    @Test
    public void postOrderIterator_singleStack_deeplyNested() throws Exception {
        Iterator<Integer> iterator = new PostOrderBinaryTreeIteratorSingleStack<>(
                BinaryTreeTestUtils.generateDeepBinaryTree()
                                   .getRoot());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(4), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(9), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(5), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(2), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(8), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(6), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(7), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(3), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(1), iterator.next());

        assertFalse(iterator.hasNext());
    }


    @Test
    public void traversePostOrder() throws Exception {
        BinaryTree<Integer> binaryTree = BinaryTreeTestUtils.generateBinaryTree();
        assertEquals(binaryTree.traverse(TraversalOrder.POST), Arrays.asList(4, 5, 2, 3, 1));
    }

    @Test
    public void preOrderIterator() throws Exception {
        Iterator<Integer> iterator = BinaryTreeIterator.preOrderIterator(BinaryTreeTestUtils.generateBinaryTree());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(1), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(2), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(4), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(5), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(3), iterator.next());

        assertFalse(iterator.hasNext());
    }

    @Test
    public void levelOrderIterator() throws Exception {
        Iterator<Integer> iterator = BinaryTreeIterator.levelOrderIterator(BinaryTreeTestUtils.generateBinaryTree());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(1), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(2), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(3), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(4), iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(5), iterator.next());

        assertFalse(iterator.hasNext());
    }


}
