class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                min = Math.min(min, dp[i - j * j]);
            }
            dp[i] = min + 1;
        }
        return dp[n];
    }
}
/**
 * 解答成功:
 * 执行耗时:26 ms,击败了71.18% 的Java用户
 * 内存消耗:40.3 MB,击败了52.36% 的Java用户
 */