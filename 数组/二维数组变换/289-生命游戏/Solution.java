class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                check(i, j, m, n, board);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 2) {
                    board[i][j] = 1;
                }
                if (board[i][j] == 3) {
                    board[i][j] = 0;
                }
            }
        }
    }

    private void check(int i, int j, int m, int n, int[][] board) {
        // 如果活细胞周围八个位置的活细胞数少于两个，则该位置活细胞死亡；
        //如果活细胞周围八个位置有两个或三个活细胞，则该位置活细胞仍然存活；
        //如果活细胞周围八个位置有超过三个活细胞，则该位置活细胞死亡；
        //如果死细胞周围正好有三个活细胞，则该位置死细胞复活；
        // 0 死细胞 1 活细胞 2 死-》活 3 活-》死
        // 上，右上，右，右下，下，左下，左，左上
        int[][] dreact = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};
        int sumLive = 0;
        for (int k = 0; k < 8; k++) {
            int row = i + dreact[k][0];
            int col = j + dreact[k][1];
            if (row < 0 || row >= m || col < 0 || col >= n) {
                continue;
            }
            if (board[row][col] % 2 == 1) {
                sumLive++;
            }
        }
        if ((sumLive < 2 || sumLive > 3) && board[i][j] == 1) {
            board[i][j] = 3;
        }
        if (sumLive == 3 && board[i][j] == 0) {
            board[i][j] = 2;
        }
    }
}
/**
 * 解答成功:
 * 					执行耗时:0 ms,击败了100.00% 的Java用户
 * 					内存消耗:39.7 MB,击败了21.31% 的Java用户
 */