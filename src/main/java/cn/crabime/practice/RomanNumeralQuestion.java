package cn.crabime.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字问题，将任意的罗马数字转化为阿拉伯数字
 */
public class RomanNumeralQuestion {

    public int convert(String romanNumeral) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('X', 10);
        map.put('V', 5);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        if (romanNumeral.length() == 1) {
            return map.get(romanNumeral.charAt(0));
        }
        char[] literal = romanNumeral.toCharArray();
        int result = 0;
        for (int i = literal.length - 1; i >= 0; i--) {
            int tmp = map.get(literal[i]);
            result += tmp;
            while (i > 0 && tmp > map.get(literal[i - 1])) {
                result = result - map.get(literal[i - 1]);
                i--;
            }
        }

        return result;

    }
}
