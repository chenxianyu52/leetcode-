class Solution {
    int result = 0;

    public int totalNQueens(int n) {
        boolean[] colStatus = new boolean[n];
        boolean[] xie1 = new boolean[2 * n - 1];
        boolean[] xie2 = new boolean[2 * n - 1];
        dfs(0, n, colStatus, xie1, xie2);
        return result;
    }

    private void dfs(int row, int n, boolean[] colStatus, boolean[] xie1, boolean[] xie2) {
        if (row >= n) {
            result++;
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!colStatus[i] && !xie1[row - i + n - 1] && !xie2[row + i]) {
                colStatus[i] = true;
                xie1[row - i + n - 1] = true;
                xie2[row + i] = true;
                dfs(row + 1, n, colStatus, xie1, xie2);
                colStatus[i] = false;
                xie1[row - i + n - 1] = false;
                xie2[row + i] = false;
            }
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.4 MB,击败了51.23% 的Java用户
 */