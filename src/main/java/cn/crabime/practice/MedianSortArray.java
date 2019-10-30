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
}
