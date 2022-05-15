class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return move(0, 0, obstacleGrid, new HashMap<Pair, Integer>());
    }

    private int move(int x, int y, int[][] obstacleGrid, HashMap<Pair, Integer> cacheMap) {
        Pair pair = new Pair(x, y);
        if (cacheMap.containsKey(pair)) {
            return cacheMap.get(pair);
        }
        if (x > obstacleGrid[0].length - 1 || y > obstacleGrid.length - 1 || obstacleGrid[y][x] == 1) {
            return 0;
        }
        if (y == obstacleGrid.length - 1 && x == obstacleGrid[0].length - 1) {
            return 1;
        }
        int res = move(x + 1, y, obstacleGrid, cacheMap) + move(x, y + 1, obstacleGrid, cacheMap);
        cacheMap.put(pair, res);
        return res;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了5.38% 的Java用户
 * 内存消耗:40.6 MB,击败了5.18% 的Java用户
 */