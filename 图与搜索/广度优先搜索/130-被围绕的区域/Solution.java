class Solution {
    private int[] dx = {0, -1, 0, 1};
    private int[] dy = {-1, 0, 1, 0};

    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] status = new boolean[m][n]; // 判断是否走过
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O' && !status[0][j]) {
                dfs(0, j, status, m, n, board);
            }
        }
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O' && !status[i][0]) {
                dfs(i, 0, status, m, n, board);
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            if (board[i][n - 1] == 'O' && !status[i][n - 1]) {
                dfs(i, n - 1, status, m, n, board);
            }
        }

        for (int j = n - 1; j >= 0; j--) {
            if (board[m - 1][j] == 'O' && !status[m - 1][j]) {
                dfs(m - 1, j, status, m, n, board);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O' && !status[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void dfs(int i, int j, boolean[][] status, int m, int n, char[][] board) {
        if (i < 0 || i >= m) {
            return;
        }

        if (j < 0 || j >= n) {
            return;
        }

        if (board[i][j] == 'X' || status[i][j]) {
            return;
        }

        status[i][j] = true;
        for (int k = 0; k < 4; k++) {
            int xx = i + dx[k];
            int yy = j + dy[k];
            dfs(xx, yy, status, m, n, board);
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了99.64% 的Java用户
 * 内存消耗:42.9 MB,击败了74.81% 的Java用户
 */