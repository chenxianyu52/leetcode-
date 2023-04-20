class Solution {
    int[][] row = new int[10][10];
    int[][] col = new int[10][10];
    int[][] area = new int[10][10];

    public void solveSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int num = board[i][j] - '0';
                int idx = (i / 3) * 3 + (j / 3);
                row[i][num] = 1;
                col[j][num] = 1;
                area[idx][num] = 1;
            }
        }
        dfs(0, 0, board);
    }

    private boolean dfs(int i, int j, char[][] board) {
        if (i >= 9) {
            return true;
        }
        if (board[i][j] != '.') {
            if (j + 1 == 9) {
                return dfs(i + 1, 0, board);
            } else {
                return dfs(i, j + 1, board);
            }
        } else {
            int idx = (i / 3) * 3 + (j / 3);
            for (int k = 1; k <= 9; k++) {
//                System.out.println("i: " + i + " , j: " + j + " , k: " + k + ", row[" + i + "][" + k +"]: " + row[i][k] + ", col[" + j + "][" + k +"]: " + col[i][k] + ", area[" + idx + "][" + k +"]: " + area[idx][k]);
                if (row[i][k] == 0 && col[j][k] == 0 && area[idx][k] == 0) {
                    board[i][j] = (char) (k + '0');
                    row[i][k] = 1;
                    col[j][k] = 1;
                    area[idx][k] = 1;
                    if (j + 1 == 9) {
                        if (dfs(i + 1, 0, board)) {
                            return true;
                        }
                    } else {
                        if (dfs(i, j + 1, board)) {
                            return true;
                        }
                    }
                    board[i][j] = '.';
                    row[i][k] = 0;
                    col[j][k] = 0;
                    area[idx][k] = 0;
                }
            }
        }
        return false;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了98.90% 的Java用户
 * 内存消耗:39 MB,击败了42.89% 的Java用户
 */