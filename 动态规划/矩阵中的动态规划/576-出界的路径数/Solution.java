class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][] dd = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
        int result = 0;
        int[][][] dp = new int[maxMove + 1][m][n];
        dp[0][startRow][startColumn] = 1;
        for (int i = 0; i < maxMove; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    int count = dp[i][j][k];
                    if (count > 0) {
                        for (int di = 0; di < 4; di++) {
                            int j2 = j + dd[di][0];
                            int k2 = k + dd[di][1];
                            if (j2 >= 0 && k2 >= 0 && j2 < m && k2 < n) {
//                                System.out.println("i : " + i + " , j : " + j2 + ", k: " + k2);
                                dp[i + 1][j2][k2] = (dp[i + 1][j2][k2] + count) % 1000000007;
                            } else {
                                result = (result + count) % 1000000007;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:4 ms,击败了78.47% 的Java用户
 * 内存消耗:39.8 MB,击败了70.82% 的Java用户
 */