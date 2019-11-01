package cn.crabime.practice;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:
 *
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-subarray
 */
public class MaxSubArray {

    /**
     * 速度最慢，O(n^2)
     */
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int len = nums.length;
        // 每一个位置i的遍历都有可能产生historyMax
        int historyMax = Integer.MIN_VALUE;

        for (int i = 0; i < len; i++) {
            if (nums[i] > historyMax) {
                historyMax = nums[i];
            }

            // 有可能最大值组成数组只有一个元素
            int max = nums[i];
            for (int j = i + 1; j < len; j++) {
                max = max + nums[j];
                if (max > historyMax) {
                    historyMax = max;
                }
            }
        }
        return historyMax;
    }

    /**
     * 速度最快：O(n)
     */
    public int maxSubArrayFastest(int[] nums) {
        int sum = nums[0];
        int max = 0;
        for (int num : nums) {
            if (max > 0) {
                max += num;
            } else {
                max = num;
            }
            sum = Math.max(sum, max);
        }
        return sum;
    }
}
