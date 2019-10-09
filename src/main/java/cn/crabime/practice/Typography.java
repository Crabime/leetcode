package cn.crabime.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Typography {

    public static int start(String origin) {
        int result = 0;
        Set<String> rs = new HashSet<>();
        // 字母长度从0到最长
        for (int i = 0; i <= origin.length(); i++) {

            for (int j = 0; j <= origin.length(); j++) {
                if (i < j) {
                    rs.add(origin.substring(i, j));
                } else if (i > j) {
                    String str = origin.substring(j, i);
                    StringBuilder builder = new StringBuilder();
                    for (int k = str.length(); k > 0; k--) {
                        char c = str.charAt(k - 1);
                        builder.append(c);
                    }
                    rs.add(builder.toString());

                }
            }
        }

        System.out.println(Arrays.toString(rs.toArray()));
        result = rs.size();
        return result;
    }

    public static void main(String[] args) {
        String model = "AAB";
        System.out.println(model + "结果为：" + start(model));
    }
}
