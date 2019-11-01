package cn.crabime.practice;

/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 *
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 *
 * 示例:
 *
 * 输入: "Hello World"
 * 输出: 5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/length-of-last-word
 */
public class LengthOfLastWorldQuestion {

    public int lengthOfLastWord(String s) {
        if (s.length() == 0) {
            return 0;
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                for (int j = i - 1; j >= 0; j--){
                    if (s.charAt(j) == ' ') {
                        return i - j;
                    }
                }
                return i + 1;
            }
        }
        return s.charAt(0) == ' ' ? 0 : s.length();
    }
}
