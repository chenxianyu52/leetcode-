class Solution {
    public int countBattleships(char[][] board) {
        int sum = 0;
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'X') {
                    if (i - 1 >= 0 && board[i - 1][j] == 'X') {
                        continue;
                    }
                    if (j - 1 >= 0 && board[i][j - 1] == 'X') {
                        continue;
                    }
                    sum++;
                }
            }
        }
        return sum;
    }
}

/**
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:40.6 MB,击败了5.01% 的Java用户
 */