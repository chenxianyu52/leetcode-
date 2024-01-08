class Solution {
    public int maximalSquare(char[][] matrix) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        int[][] dp = new int[rowLen][colLen];
        int result = 0;
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if (matrix[i][j] == '1') {
                    result = 1;
                    dp[i][j] = 1;
                }
            }
        }

        for (int i = 1; i < rowLen; i++) {
            for (int j = 1; j < colLen; j++) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                    result = Math.max(dp[i][j], result);
                }
            }
        }
        return result * result;

    }
}
/**
 * 执行耗时:4 ms,击败了99.76% 的Java用户
 * 内存消耗:56.2 MB,击败了5.55% 的Java用户
 */