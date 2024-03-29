package cn.crabime.practice;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 *
 * 示例 1:
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-insert-position
 */
public class SearchInsertQuestion {

    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int index = 0;
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] >= target) {
                index = i;
                break;
            }
        }
        if (i == nums.length) {
            index = nums.length;
        }
        return index;
    }
}
