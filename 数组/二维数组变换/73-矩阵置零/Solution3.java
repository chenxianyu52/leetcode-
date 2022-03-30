class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean colStatus = false;
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                colStatus = true;
            }
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (colStatus) {
                matrix[i][0] = 0;
            }
        }
    }
}
/**
 * 解答成功:
 * 				执行耗时:0 ms,击败了100.00% 的Java用户
 * 				内存消耗:42.8 MB,击败了45.62% 的Java用户
 * 			控件O（1）
 */