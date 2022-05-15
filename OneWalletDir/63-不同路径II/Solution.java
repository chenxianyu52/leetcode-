class Solution {
    int result = 0;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        move(0, 0, obstacleGrid);
        return result;
    }

    private void move(int x, int y, int[][] obstacleGrid) {
        if (obstacleGrid[y][x] == 1) {
            return;
        }
        if (y == obstacleGrid.length - 1 && x == obstacleGrid[0].length - 1) {
            result++;
            return;
        }
        if (x < obstacleGrid[0].length - 1) {
            move(x + 1, y, obstacleGrid);
        }

        if (y < obstacleGrid.length - 1) {
            move(x, y + 1, obstacleGrid);
        }
    }

}
/**
 * 运行失败:
 * Time Limit Exceeded
 */