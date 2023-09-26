class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = coins.length - 1; j >= 0; j--) {
                if (coins[j] > i) {
                    continue;
                }
                if (coins[j] == i) {
                    dp[i] = 1;
                } else {
                    if (dp[i - coins[j]] != Integer.MAX_VALUE) {
                        dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                    }
                }
            }
        }
        if (dp[amount] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return dp[amount];
        }

    }
}
/**
 * 解答成功:
 * 执行耗时:15 ms,击败了38.64% 的Java用户
 * 内存消耗:42 MB,击败了45.82% 的Java用户
 */