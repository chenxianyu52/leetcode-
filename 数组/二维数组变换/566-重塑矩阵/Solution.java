class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) {
            return mat;
        }
        int[][] result = new int[r][c];
        int row = 0;
        int col = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = mat[row][col];
                if (col + 1 == n) {
                    row++;
                    col = 0;
                } else {
                    col++;
                }
            }
        }
        return result;

    }
}
/**
 * 解答成功:
 * 				执行耗时:0 ms,击败了100.00% 的Java用户
 * 				内存消耗:42.1 MB,击败了48.40% 的Java用户
 */