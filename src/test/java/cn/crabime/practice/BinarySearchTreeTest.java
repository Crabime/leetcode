package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

public class BinarySearchTreeTest extends TestCase {

    @Test
    public void testInsertIntoBinarySearchTree() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(5);
        binarySearchTree.insert(12);
        binarySearchTree.insert(-1);
        binarySearchTree.insert(4);
        assertEquals(-1, binarySearchTree.findMin());
        assertEquals(12, binarySearchTree.findMax());
        assertTrue(binarySearchTree.contains(4));
    }
}
