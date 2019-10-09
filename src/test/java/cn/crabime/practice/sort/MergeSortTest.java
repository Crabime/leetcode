package cn.crabime.practice.sort;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

public class MergeSortTest extends TestCase {

    private MergeSort ms = new MergeSort();

    @Test
    public void testMergeSort() {
        int[] arr = {3, 5, 1, -1, 2, 6, 4, 5, 5, 2, 3};
        ms.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
