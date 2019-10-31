package cn.crabime.practice;

/**
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * 链接：https://leetcode-cn.com/problems/remove-element
 */
public class RemoveElementInPlace {

    /**
     * 双端指针法，通过j做卫星定位
     * @param nums 原始数组
     * @param val 从数组中去除的值
     * @return 去除重复值后的数组
     */
    public int removeElement(int[] nums, int val) {
        if (nums.length == 1) {
            if (nums[0] == val) {
                return 0;
            }
            return 1;
        }

        int i = 0, j = 0;
        for (; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
