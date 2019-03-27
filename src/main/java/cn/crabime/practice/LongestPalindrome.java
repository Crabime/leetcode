package cn.crabime.practice;

public class LongestPalindrome {

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
        String subStr = str.substring(begin + 1, end);
        return subStr;
    }

    public static void main(String[] args) {
        LongestPalindrome palindrome = new LongestPalindrome();
        String result = palindrome.longestPalindrome("abcbacd");
        System.out.println(result);
    }
}
