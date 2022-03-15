class Solution {
    public int countBattleships(char[][] board) {
        int sum = 0;
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (check(i, j, board)) {
                    sum++;
                }
            }
        }
        return sum;
    }

    private boolean check(int i, int j, char[][] board) {
        int m = board.length;
        int n = board[0].length;
        if (i < m && j < n && i >= 0 && j >= 0 && board[i][j] == 'X') {
            board[i][j] = '.';
            check(i - 1, j, board);
            check(i, j - 1, board);
            check(i, j + 1, board);
            check(i + 1, j, board);
            return true;
        } else {
            return false;
        }
    }
}
//runtime:1 ms
//memory:40.6 MB
