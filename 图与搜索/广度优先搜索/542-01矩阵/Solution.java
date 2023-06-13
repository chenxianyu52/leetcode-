class Solution {
    int[] dx = {0, -1, 0, 1}; // 左上右下
    int[] dy = {-1, 0, 1, 0};

    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(result[i], 10001);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    result[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= 1) {
                    result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
                }
                if (j >= 1) {
                    result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
                }
            }
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (i < m - 1) {
                    result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
                }
                if (j >= 1) {
                    result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if (i >= 1) {
                    result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
                }
                if (j < n - 1) {
                    result[i][j] = Math.min(result[i][j], result[i][j + 1] + 1);
                }
            }
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i < m - 1) {
                    result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
                }
                if (j < n - 1) {
                    result[i][j] = Math.min(result[i][j], result[i][j + 1] + 1);
                }
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:8 ms,击败了83.51% 的Java用户
 * 内存消耗:45.1 MB,击败了30.12% 的Java用户
 */