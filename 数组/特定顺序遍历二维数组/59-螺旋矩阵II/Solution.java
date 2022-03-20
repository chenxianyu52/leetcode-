class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directionIndex = 0;
        int row = 0;
        int col = 0;
        for (int i = 1; i <= n * n; i++) {
            result[row][col] = i;
            int nextRow = row + directions[directionIndex][0];
            int nextCol = col + directions[directionIndex][1];
            if (nextCol < 0 || nextCol >= n || nextRow < 0 || nextRow >= n || result[nextRow][nextCol] > 0) {
                directionIndex = (directionIndex + 1) % 4;
            }
            row = row + directions[directionIndex][0];
            col = col + directions[directionIndex][1];
        }
        return result;
    }
}
/**
 * 解答成功:
 * 					执行耗时:0 ms,击败了100.00% 的Java用户
 * 					内存消耗:39.7 MB,击败了5.03% 的Java用户
 */