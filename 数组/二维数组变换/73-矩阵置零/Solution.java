class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] status = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    status[i][j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (status[i][j]) {
                    check(i, j, matrix, m, n);
                }
            }
        }

    }

    private void check(int i, int j, int[][] matrix, int m, int n) {
        for (int p = 0; p < m; p++) {
            matrix[p][j] = 0;
        }
        for (int q = 0; q < n; q++) {
            matrix[i][q] = 0;
        }
    }
}
/**
 * 解答成功:
 * 				执行耗时:1 ms,击败了57.13% 的Java用户
 * 				内存消耗:43.1 MB,击败了14.07% 的Java用户
 *
 * 空间复杂度是O（m*n）
 */