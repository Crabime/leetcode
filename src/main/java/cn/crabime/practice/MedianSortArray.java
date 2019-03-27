package cn.crabime.practice;

import java.util.Arrays;

public class MedianSortArray {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                res[i + j] = nums1[i];
                i++;
            } else {
                res[i + j] = nums2[j];
                j++;
            }
        }
        while (i < nums1.length) {
            res[i + j] = nums1[i++];
        }
        while (j < nums2.length) {
            res[i + j] = nums2[j++];
        }
        System.out.println(Arrays.toString(res));
        if (res.length % 2 == 0) {
            return (res[res.length / 2] + res[(res.length / 2) - 1]) * 1.0 / 2;
        } else {
            return res[res.length / 2];
        }
    }

    public static void main(String[] args) {
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
