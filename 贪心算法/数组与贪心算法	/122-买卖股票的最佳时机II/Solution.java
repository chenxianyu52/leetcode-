class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                maxPrice = prices[i];
            } else {
                result += (prices[i] - minPrice);
                maxPrice = prices[i];
                minPrice = prices[i];
            }
        }
        return result;

    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41.3 MB,击败了53.33% 的Java用户
 */