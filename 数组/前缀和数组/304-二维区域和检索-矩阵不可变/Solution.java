class NumMatrix {

    private int[][] resultSum = null;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        resultSum = new int[m + 1][n + 1];
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                resultSum[i][j] = resultSum[i][j - 1] + resultSum[i - 1][j] + matrix[i - 1][j - 1] - resultSum[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return resultSum[row2 + 1][col2 + 1] - resultSum[row1][col2 + 1] - resultSum[row2 + 1][col1] + resultSum[row1][col1];
    }
}

/**
 * 解答成功:
 * 执行耗时:103 ms,击败了89.58% 的Java用户
 * 内存消耗:63.2 MB,击败了73.64% 的Java用户
 */