package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedArrayMediumTest extends TestCase {

    @Test
    public void testFindMedianSortedArrays() {
        SortedArrayMedium medium = new SortedArrayMedium();
        int[] a = {2, 3, 4};
        int[] b = {3, 4, 5};
        double res = medium.findMedianSortedArrays(b, a);
        System.out.println("结果为：" + res);
    }
}