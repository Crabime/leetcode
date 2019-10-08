package cn.crabime.practice;

import java.util.regex.Pattern;

/**
 * 字符串转换整数
 */
public class MyAtomic {

    public int myAtomic(String str) {
        Pattern pattern = Pattern.compile("[0-9\\+-]");
        char tmp;
        String fc;
        int first = -1;
        int last = -1;
        for (int i = 0; i < str.length(); i++) {
            tmp = str.charAt(i);
            if (tmp != ' ') {
               first = i;
               break;
            }
        }
        if (first == -1) {
            return 0;
        }
        fc = str.substring(first, first + 1);

        if (!pattern.matcher(fc).matches()) {
            return 0;
        }
        for (int i = first + 1; i < str.length(); i++) {
            tmp = str.charAt(i);
            if (tmp < 48 || tmp > 57) {
                last = i;
                break;
            }
        }
        System.out.println(str + "输出结果为：" + Integer.parseInt(str.substring(first, last)));
        return Integer.parseInt(str.substring(first, last));
    }
}
