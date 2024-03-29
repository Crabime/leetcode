package cn.crabime.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 *
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 */
public class ZConvert {

    public String convert(String s, int numRows) {

        System.out.println("输入字符串为：" + s + "，行数为：" + numRows);

        if (numRows == 1) return s;
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            // 添加纵向矩阵
            list.add(new StringBuilder());
        }

        int curRow = 0;
        boolean goingDown = false;

        // 上下移动矩阵
        for (char c : s.toCharArray()) {
            list.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) {
                goingDown = !goingDown;
            }
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder builder : list) ret.append(builder);
        System.out.println("输出结果为：" + ret.toString());
        return ret.toString();
    }
}
