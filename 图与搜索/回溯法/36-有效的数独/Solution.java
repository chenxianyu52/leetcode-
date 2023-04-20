class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] col = new int[10][10];
        int[][] row = new int[10][10];
        int[][] area = new int[10][10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int num = board[i][j] - '0';
                int idx = (i / 3) * 3 + (j / 3);
                if (row[i][num] != 0 || col[j][num] != 0 || area[idx][num] != 0) {
                    return false;
                }
                row[i][num] = num;
                col[j][num] = num;
                area[idx][num] = num;
            }
        }
        return true;

    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了99.94% 的Java用户
 * 内存消耗:41.4 MB,击败了44.51% 的Java用户
 */