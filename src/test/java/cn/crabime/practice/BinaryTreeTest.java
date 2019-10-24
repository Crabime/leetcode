package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

public class BinaryTreeTest extends TestCase {

    @Test
    public void testBinaryTree() {
        int[] arr = {-5, -7, 1, 0, 15, -2};
        BinaryTree binaryTree = new BinaryTree(arr);
        System.out.println(binaryTree);
    }
}
