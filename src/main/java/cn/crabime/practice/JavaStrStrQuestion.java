package cn.crabime.practice;

/**
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 */
public class JavaStrStrQuestion {

    public int strStr(String haystack, String needle) {
        if (haystack == null || (haystack.length() == 0 && needle.length() != 0) || needle.length() > haystack.length()) {
            return -1;
        }
        if (needle == null || (needle.length() == 0 && haystack.length() == 0 )) {
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            // 临时变量标识当前i的位置
            int tmp = i;
            int j = 0;
            while (j < needle.length()) {
                if (tmp < haystack.length() && needle.charAt(j) == haystack.charAt(tmp)) {
                    j++;
                    tmp++;
                } else {
                    break;
                }
            }

            if (j == needle.length() || tmp - i == haystack.length()) {
                return i;
            }
        }
        return -1;
    }
}
