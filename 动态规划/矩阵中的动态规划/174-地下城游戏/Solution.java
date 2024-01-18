class Solution {
    int[][] temp;

    public int calculateMinimumHP(int[][] dungeon) {
        int rowLen = dungeon.length;
        int colLen = dungeon[0].length;
        temp = new int[rowLen][colLen];
        return dfs(0, 0, dungeon, rowLen, colLen);
    }

    private int dfs(int x, int y, int[][] dungeon, int rowLen, int colLen) {
//        System.out.println("x: " + x + " , y: " + y );
        if (x == rowLen - 1 && y == colLen - 1) {
            return Math.max(1 - dungeon[x][y], 1);
        }
        if (temp[x][y] > 0) {
            return temp[x][y];
        }
        int min = 0;
        if (x == rowLen - 1) {
            min = Math.max(dfs(x, y + 1, dungeon, rowLen, colLen) - dungeon[x][y], 1);
        } else if (y == colLen - 1) {
            min = Math.max(dfs(x + 1, y, dungeon, rowLen, colLen) - dungeon[x][y], 1);
        } else {
            min = Math.max(Math.min(dfs(x, y + 1, dungeon, rowLen, colLen), dfs(x + 1, y, dungeon, rowLen, colLen)) - dungeon[x][y], 1);
        }
        return temp[x][y] = min;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:44.2 MB,击败了5.19% 的Java用户
 */