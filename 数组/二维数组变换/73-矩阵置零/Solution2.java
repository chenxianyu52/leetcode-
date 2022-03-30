class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Pair<Integer, Integer>> rowList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowList.add(new Pair(i, j));
                }
            }
        }

        int rowListLen = rowList.size();
        for (int i = 0; i < rowListLen; i++) {
            check(rowList.get(i).getKey(), rowList.get(i).getValue(), matrix, m, n);
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
 * 				内存消耗:42.7 MB,击败了50.95% 的Java用户
 */