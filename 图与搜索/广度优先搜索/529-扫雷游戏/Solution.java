class Solution {
    private int[] dx = {0, 1, 0, -1};
    private int[] dy = {1, 0, -1, 0};
    private int[] leiDx = {-1, -1, -1, 0, 0, 1, 1, 1}; // 左上，上，右上，左，右，左下，下，右下
    private int[] leiDy = {-1, 0, 1, -1, 1, -1, 0, 1};
    int[][] status;

    public char[][] updateBoard(char[][] board, int[] click) {
        int row = click[0];
        int col = click[1];
        if (board[row][col] == 'B') {
            return board;
        }
        if (board[row][col] == 'M') {
            board[row][col] = 'X';
            return board;
        }
        int len = board.length;
        int colLen = board[0].length;
        status = new int[len][colLen];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < colLen; j++) {
                check(board, i, j);
            }
        }
        dfs(row, col, board);
        return board;
    }


    private void check(char[][] board, int i, int j) {
        if (board[i][j] != 'M') {
            return;
        }
        for (int k = 0; k < 8; k++) {
            int xx = i + leiDx[k];
            int yy = j + leiDy[k];
            if (xx >= 0 && yy >= 0 && xx < board.length && yy < board[0].length) {
//                System.out.println("xx: " + xx + ", yy : " + yy + "");
                status[xx][yy]++;
            }
        }
    }


    private void dfs(int i, int j, char[][] board) {
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0) {
            return;
        }
        if (board[i][j] <= '8' && board[i][j] >= '1') {
            return;
        }
        if (board[i][j] == 'M' || board[i][j] == 'B') {
            return;
        }
//        System.out.println("i : " + i + ", j : " + j + " , status: " + status[i][j]);
        if (status[i][j] == 0) {
            board[i][j] = 'B';
            for (int k = 0; k < 8; k++) {
                dfs(i + leiDx[k], j + leiDy[k], board);
            }
        } else {
            board[i][j] = (char) ('0' + status[i][j]);
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了33.08% 的Java用户
 * 内存消耗:42.7 MB,击败了19.36% 的Java用户
 */