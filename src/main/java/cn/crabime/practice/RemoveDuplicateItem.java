package cn.crabime.practice;

/**
 * 删除数组重复项
 */
public class RemoveDuplicateItem {

    // TODO: 10/30/19 完善该方法
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        int len = 1;

        for (int i = 0; i < nums.length - 1;) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    len++;
                    i = j;
                    break;
                }
            }
            i++;
        }

        return len;
    }
}
