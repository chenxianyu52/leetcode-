class Solution {
    public int maxProfit(int[] prices) {
        int minPrices = Integer.MAX_VALUE;
        int result = 0;
        int len = prices.length;
        for (int i = 0; i < len; i++) {
            if (prices[i] < minPrices) {
                minPrices = prices[i];
            } else {
                result = Math.max(result, prices[i] - minPrices);
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:57.9 MB,击败了19.31% 的Java用户
 */