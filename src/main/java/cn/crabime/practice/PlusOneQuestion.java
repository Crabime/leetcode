package cn.crabime.practice;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 */
public class PlusOneQuestion {

    public int[] plusOne(int[] digits) {

        boolean carry = true;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (carry) {
                digits[i] = (digits[i] + 1) % 10;
            }
            if ((digits[i]) == 0) {
                carry = true;
            } else {
                carry = false;
                break;
            }
        }

        if (carry) {
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            for (int i = 1; i < arr.length; i++) {
                arr[i] = digits[i - 1];
            }
            return arr;
        }
        return digits;
    }
}
