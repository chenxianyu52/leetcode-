class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            int f = coins[i];
            for (int j = f; j <= amount; j++) {
                dp[j] = dp[j] + dp[j - f];
            }
        }
        return dp[amount];
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了99.10% 的Java用户
 * 内存消耗:38.8 MB,击败了72.50% 的Java用户
 */