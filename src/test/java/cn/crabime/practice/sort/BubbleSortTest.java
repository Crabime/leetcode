package cn.crabime.practice.sort;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest extends TestCase {

    @Test
    public void testSimpleBubbleTest() {
        int[] a = {1, 0, 5, -1, 4, 20, -13, 15, 1, 10, -6, 14, 17, 20, -10, -9, 12, 8, 6, 21};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    @Test
    public void testAdvanceBubbleTest() {
        int[] a = {1, 0, 5, -1, 4, 20, -13, 15, 1, 10, -6, 14, 17, 20, -10, -9, 12, 8, 6, 21};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.advanceBubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
