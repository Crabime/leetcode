package cn.crabime.practice;

public class RevertInteger {

    public int reverse(int x) {
        String xs = String.valueOf(x);

        boolean continueFlag = false;
        StringBuilder builder = new StringBuilder();
        char flag = xs.charAt(0);

        for (int i = 0; i < xs.length() - 1; i++) {
            char c = xs.charAt(xs.length() - i - 1);
            if (c == '0' && !continueFlag) {
                continue;
            } else {
                builder.append(c);
                continueFlag = true;
            }
        }
        builder = flag == '-' ? builder.insert(0, flag) : builder.append(flag);
        System.out.println("数字[" + x + "]转化结果为" + builder.toString());
        return Integer.parseInt(builder.toString());
    }

    public static void main(String[] args) {
        RevertInteger ri = new RevertInteger();
        int a = 1230;
        ri.reverse(a);
        a = -1230;
        ri.reverse(a);
        a = 1534236469;
        ri.reverse(a);
    }
}
