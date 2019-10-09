package cn.crabime.practice.sort;


import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest extends TestCase {

    private QuickSort quickSort = new QuickSort();

    private void quickSortAndOutput(int[] a) {
        quickSort.quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    @Test
    public void testQuickSortLessThanCUTOFF() {
        int[] a = {1, 0, 5, -1, 4};
        quickSortAndOutput(a);
    }

    public void testQuickSortLargerThanCUTOFF() {
        int[] a = {1, 0, 5, -1, 4, 20, -13, 15, 1, 10, -6, 14, 17, 20, -10, -9, 12, 8, 6, 21};
        quickSortAndOutput(a);

    }

    /**
     * 测试java中for循环在break后，break之后的语句能否正常执行
     */
    @Test
    public void testBreakInJava() {
        for (int i = 0; i < 5; i++) {
            if (i == 3)
                break;
            System.out.println("num=[" + i + "]");
        }
    }


}
