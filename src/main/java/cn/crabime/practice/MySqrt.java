package cn.crabime.practice;

/**
 * 实现 int sqrt(int x) 函数。
 *
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 * 示例 1:
 *
 * 输入: 4
 * 输出: 2
 * 示例 2:
 *
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 *      由于返回类型是整数，小数部分将被舍去。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sqrtx
 */
public class MySqrt {

    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }

        int i = x / 2;
        if (i * i == x) {
            return i;
        }
        int threshold = 46340;
        i = Math.min(i, threshold);
        if (i * i > x) {
            while (i * i > x) {
                i = i - 1;
            }
            return i;
        } else {
            while (i * i < x) {
                i = i + 1;
                if (i > threshold) {
                    return threshold;
                }
            }

            return i * i  == x ? i : i - 1 ;
        }
    }

    public int mySqrtUsingBinaryMethod(int x) {
        long left = 0, right = Integer.MAX_VALUE;
        while (left < right) {

            // 最快的取中位数方法
            long mid = (left + right + 1) >>> 1;
            long square = mid * mid;

            if (square > x) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }

        return (int) left;
    }
}
