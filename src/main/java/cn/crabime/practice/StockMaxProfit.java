package cn.crabime.practice;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 *
 * 注意你不能在买入股票前卖出股票。
 *
 * 示例 1:
 *
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 * 示例 2:
 *
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock
 */
public class StockMaxProfit {

    public int maxProfit(int[] prices) {
        // 为空或长度为1，值为0
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }
        int max = 0;
        for (int i = prices.length - 1; i >= 0; i--) {

            for (int j = i; j >= 0; j--) {
                int profit = prices[i] - prices[j];
                max = Math.max(profit, max);
            }
        }
        return max;
    }

    public int advanceMaxProfit(int[] prices) {
        // 为空或长度为1，值为0
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }
        int max = 0;
        for (int i = prices.length - 1; i > 0; i--) {
            if (prices[i] < prices[i - 1]) {
                continue;
            } else {
                for (int j = i - 1; j >= 0; j--) {
                    int profit = prices[i] - prices[j];
                    max = Math.max(profit, max);
                }
            }
        }
        return max;
    }

    /**
     * 一次遍历，O(n)算法复杂度
     */
    public int advanceMaxProfitFastest(int[] prices) {
        int minPrice = Integer.MAX_VALUE;

        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > profit) {
                profit = prices[i] - minPrice;
            }
        }
        return profit;
    }
}
