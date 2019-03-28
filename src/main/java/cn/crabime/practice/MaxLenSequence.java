package cn.crabime.practice;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 示例 1:
 *   输入: "abcabcbb"
 *   输出: 3
 *   解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 示例 2:
 *   输入: "bbbbb"
 *   输出: 1
 *   解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 *
 * 示例 3:
 *   输入: "pwwkew"
 *   输出: 3
 *   解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *        请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class MaxLenSequence {

    public int lengthOfLongestSubstring(String s) {
        char[] o = s.toCharArray();
        int[] mp = new int[256];
        int left = 0, res = 0;
        for (int i = 0; i < o.length; i++) {
            left = Math.max(left, mp[o[i]]);
            // 字串长度
            res = Math.max(res, i - left + 1);
            // key为当前字符ASCII值，value为该字符在字符串中的位置
            mp[o[i]] = i + 1;
        }
        return res;
    }

    private void formatResult(String s) {
        System.out.println("======输入字符串" + s + "======");
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static void main(String[] args) {
        MaxLenSequence sequence = new MaxLenSequence();
        sequence.formatResult("abcabcbb");
        sequence.formatResult("bbbbb");
        sequence.formatResult("pwwkew");
    }
}
