class Solution {
    boolean[] status;
    int result = 0;

    public int findCircleNum(int[][] isConnected) {
        int len = isConnected.length;
        status = new boolean[len];
        for (int i = 0; i < len; i++) {
            if (!status[i]) {
                result++;
                dfs(isConnected, i);
            }
        }
        return result;
    }

    private void dfs(int[][] isConnected, int index) {
        if (status[index]) {
            return;
        }
        status[index] = true;

        for (int i = 0; i < isConnected.length; i++) {
            if (i == index) {
                continue;
            }
            if (isConnected[index][i] == 1) {
                dfs(isConnected, i);
            }
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了87.30% 的Java用户
 * 内存消耗:45.2 MB,击败了5.04% 的Java用户
 */