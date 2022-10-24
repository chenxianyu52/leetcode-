class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int start = prices[i];
            int max = 0;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > start) {
                    max = Math.max(max, prices[j] - start);
                }
            }
            result = Math.max(max, result);
        }
        return result;
    }
}
/**
 * 运行失败:
 * Time Limit Exceeded
 */