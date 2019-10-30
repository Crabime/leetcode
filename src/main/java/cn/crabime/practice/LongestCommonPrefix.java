package cn.crabime.practice;

/**
 * 最长公共前缀问题
 *
 * @author crabime
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 1) {
            return strs[0];
        }

        int predictLongestCommonPart = strs[0].length();
        int index = 0;
        for (int i = 1; i < len; i++) {
            int length = strs[i].length();
            if (predictLongestCommonPart > length) {
                predictLongestCommonPart = length;
                index = i;
            }
        }

        String shortestString = strs[index];
        int preIndex = -1;
        sign:
        for (int i = 0; i < shortestString.length();) {
            char c = shortestString.charAt(i);

            for (int j = 0; j < len; j++) {
                if (j != index && strs[j].charAt(i) != c) {

                    preIndex = i;
                    break sign;
                }
            }
            // 防止数组中所有string相同情况
            preIndex = ++i;
        }
        if (preIndex == -1) {
            return "";
        }

        return shortestString.substring(0, preIndex);
    }
}
