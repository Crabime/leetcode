package cn.crabime.practice;

public class PalindromeCheck {

    public boolean isPalindrome(String s) {
        if (null != s && s.isEmpty()) {
            return true;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c > 47 && c < 58) || (c > 64 && c < 91) || (c > 96 && c < 123)) {
                if (c > 96) {
                    c = (char) (c - 32);
                }
                builder.append(c);
            }
        }

        int left = 0, right = builder.length() - 1;
        while (left <= right && builder.charAt(left) == builder.charAt(right)) {
            left++;
            right--;
        }

        return left > right;
    }
}
