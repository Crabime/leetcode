package cn.crabime.practice;

import java.util.Arrays;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 *
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * 示例 1:
 *
 *   nums1 = [1, 3]
 *   nums2 = [2]
 *
 *   则中位数是 2.0
 */
public class SortedArrayMedium {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums2.length; i++) {
            res[i] = nums2[i];
        }
        for (int i = 0; i < nums1.length; i++) {
            res[nums2.length + i] = nums1[i];
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = i + 1; j < res.length; j++) {
                if (res[i] > res[j]) {
                    int temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(res));
        if (res.length % 2 == 0) {
            return (res[res.length / 2 - 1] + res[res.length / 2]) * 1.0 / 2;
        } else {
            return res[res.length / 2];
        }
    }

    public static void main(String[] args) {
        SortedArrayMedium medium = new SortedArrayMedium();
        int[] a = {2, 3, 4};
        int[] b = {3, 4, 5};
        double res = medium.findMedianSortedArrays(b, a);
        System.out.println("结果为：" + res);
    }
}
