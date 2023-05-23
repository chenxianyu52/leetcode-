class Solution {
    boolean[][] status;
    boolean result = false;

    public boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                status = new boolean[board.length][board[0].length];
                dfs(i, j, board, chars, 0);
//                System.out.println("result: " + result);
            }
        }
        return result;
    }

    private void dfs(int row, int col, char[][] board, char[] word, int wordStart) {
//        System.out.println("char: " + wordStart);
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length) {
            if (wordStart >= word.length) {
                result = true;
            }
            return;
        }

        if (wordStart >= word.length) {
            result = true;
            return;
        }

        if (col >= 0 && col <= board[0].length - 1 && row >= 0 && row <= board.length - 1 && board[row][col] == word[wordStart] && !status[row][col]) {
            status[row][col] = true;
            dfs(row, col - 1, board, word, wordStart + 1);
            dfs(row, col + 1, board, word, wordStart + 1);
            dfs(row + 1, col, board, word, wordStart + 1);
            dfs(row - 1, col, board, word, wordStart + 1);
            status[row][col] = false;
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:110 ms,击败了89.46% 的Java用户
 * 内存消耗:40.1 MB,击败了28.57% 的Java用户
 */