package cn.crabime.practice;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class MedianSortArrayTest extends TestCase {

    @Test
    public void testFindMedianSortedArrays() {
        MedianSortArray array = new MedianSortArray();
        int[] a = {2, 3};
        int[] b = {4, 5};
        double res = array.findMedianSortedArrays(a, b);
        System.out.println("结果为：" + res);

        a = new int[]{2, 4, 7, 8};
        b = new int[]{8, 10, 11, 15, 17};
        res = array.findMedianSortedArrays(a, b);
        System.out.println("结果为：" + res);

        a = new int[]{3, 4, 7};
        b = new int[]{7};
        res = array.findMedianSortedArrays(a, b);
        System.out.println("结果为：" + res);
    }
}