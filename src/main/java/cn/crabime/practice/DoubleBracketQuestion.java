package cn.crabime.practice;

import java.util.Stack;

/**
 * 有效括号数问题
 * 通过栈的策略来完成O(n)复杂度
 */
public class DoubleBracketQuestion {

    public boolean isValid(String s) {

        if (null == s || s.length() == 1) {
            return false;
        }

        if (s.length() == 0) {
            return true;
        }

        // 奇数一定是错误的
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.size() == 0) {
                stack.push(s.charAt(i));
            } else if (equals(stack.peek(), s.charAt(i))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        return stack.size() == 0;
    }

    private boolean equals(char left, char right) {
        return left == '{' && right == '}' || left == '[' && right == ']' || left == '(' && right == ')';
    }
}
