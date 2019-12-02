package cn.crabime.practice;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 *
 * 链接：https://leetcode-cn.com/problems/single-number
 */
public class SingleNumber {

    /**
     * 该种方案只能解决正整数场景
     */
    public int single(int[] nums) {
        int[] c = new int[10];

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            c[n] = c[n] + 1;
        }

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 1) {
                return i;
            }
        }
        return -1;
    }

    public int single2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
            } else {
                list.remove(new Integer(nums[i]));
            }
        }
        return list.get(0);
    }
}
