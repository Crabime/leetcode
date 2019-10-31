package cn.crabime.practice;

/**
 * 删除数组重复项
 */
public class RemoveDuplicateItem {

    /**
     * 该方法在leetcode上执行通不过，很奇怪
     * @param nums 原始数组
     * @return 不重复元素值
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int[] array = new int[nums.length];
        int len = 1;

        for (int i = 0; i < nums.length;) {
            int j = i + 1;
            array[len - 1] = nums[i];
            for (; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    len++;
                    i = j;
                    break;
                }
            }
            if (j == nums.length) {
                break;
            }

        }
        nums = array;
        return len;
    }

    /**
     * 使用双端指针方法来解决O(1)空间复杂度问题
     */
    public int removeDuplicatesUsingDoublePointer(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        int i = 0, j = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i + 1;
    }
}
