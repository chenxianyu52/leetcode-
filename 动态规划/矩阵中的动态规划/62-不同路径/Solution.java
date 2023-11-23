class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                } else {
                    if (i - 1 >= 0) {
                        dp[i][j] += dp[i - 1][j];
                    }
                    if (j - 1 >= 0) {
                        dp[i][j] += dp[i][j - 1];
                    }
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.8 MB,击败了5.13% 的Java用户
 */