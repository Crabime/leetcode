package cn.crabime.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 获取到某个字符串中最长回文子串，如abcbacd，最长回文子串为abcba
 */
public class LongestPalindrome {

    /**
     * 获取可以自由组合的最长回文子串问题
     * @param s 字符串
     * @return 生成的回文子串最大长度
     */
    public int longestPalindromeLength(String s) {
        // 防止传入的字符串为空或长度为1
        if (null == s || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        Map<Character, Integer> cache = new HashMap<>();
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer count = cache.get(c);
            if (null == count) {
                cache.put(c, 1);
            } else {
                count = count + 1;
                if (count % 2 == 0) {
                    num = num + 2;
                }
                cache.put(c, count);
            }
        }

        // 防止所有字符串出现次数都是偶数，若有一个次数为奇数则num+1
        Set<Map.Entry<Character, Integer>> entries = cache.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() % 2 != 0) {
                return num + 1;
            }
        }
        return num;
    }

    /**
     * 判断一个整数是否为回文数
     * @param a 整数
     * @return 是否为回文数
     */
    public boolean isIntegerPalindrome(int a) {
        String str = String.valueOf(a);
        if (str.length() == 1) {
            return true;
        }
        int left = 0, right = str.length() - 1;
        while (left <= right && str.charAt(left) == str.charAt(right)) {
            left++;
            right--;
        }
        return left > right;
    }

    public String longestPalindrome(String s) {
        if (null == s || s.isEmpty()) {
            return null;
        }
        if (s.length() == 1) {
            return s;
        }

        // 取第一个值为默认值
        String longestStr = s.substring(0, 1);

        // 这里要注意：回文子串有奇偶数之分，abcba、abba，前者为奇数，从中心往两边扩散即可
        // 后一种为偶数，当前位置与下个位置相同，以这两个位置为原点向两边扩散
        for (int i = 0; i < s.length(); i++) {
            String tmp = helper(s, i, i);
            if (tmp.length() > longestStr.length()) {
                longestStr = tmp;
            }

            tmp = helper(s, i, i + 1);
            if (tmp.length() > longestStr.length()) {
                longestStr = tmp;
            }
        }

        return longestStr;
    }

    private String helper(String str, int begin, int end) {
        while (begin >= 0 && end <= str.length() - 1 && str.charAt(begin) == str.charAt(end)) {
            begin--;
            end++;
        }
        return str.substring(begin + 1, end);
    }
}
