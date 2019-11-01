package cn.crabime.practice;

/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 *
 * 输入为非空字符串且只包含数字 1 和 0。
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-binary
 */
public class AddBinaryQuestion {

    public String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();

        int i = a.length() - 1, j = b.length() - 1;
        boolean carry = false;
        while (i >= 0 && j >= 0) {
            int ai = Integer.parseInt(String.valueOf(a.charAt(i)));
            int bj = Integer.parseInt(String.valueOf(b.charAt(j)));
            i--;
            j--;
            int sum = ai + bj;
            if (carry) {
                // 1 1
                // 1 1
                //-> 1 0

                result.append((sum + 1) % 2);
                carry = sum + 1 >= 2;
            } else {
                carry = sum == 2;
                result.append(sum % 2);
            }
        }

        while (i >= 0) {
            int ai = Integer.parseInt(String.valueOf(a.charAt(i)));
            if (carry) {
                result.append((ai + 1) % 2);
                carry = ai + 1 == 2;
            } else {
                result.append(ai);
            }
            i--;
        }

        while (j >= 0) {
            int aj = Integer.parseInt(String.valueOf(b.charAt(j)));
            if (carry) {
                result.append((aj + 1) % 2);
                carry = aj + 1 == 2;
            } else {
                result.append(aj);
            }
            j--;
        }

        if (carry) {
            result.append("1");
        }
        return result.reverse().toString();
    }
}
