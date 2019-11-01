package cn.crabime.practice;

/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 *
 * 说明:
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 *
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-sorted-array
 */
public class MergeSortedArrayQuestion {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        int j;
        for (int i = m; i < m + n; i++) {
            int tmp = nums1[i];
            for (j = i; j > 0 && nums1[j - 1] > tmp; j--) {
                nums1[j] = nums1[j - 1];
            }
            nums1[j] = tmp;
        }
    }

    /**
     * 双指针从后往前走
     */
    public void advanceMerge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p1 >= 0 && (p2 >= 0)) {
            nums1[p--] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
        }

        // 剩下的都是小的元素，直接放在nums1数组开头即可
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}
