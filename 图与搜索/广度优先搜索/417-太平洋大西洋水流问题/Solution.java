class Solution {
    List<List<Integer>> result = new ArrayList<>();
    int[] dx = {0, -1, 0, 1};
    int[] dy = {-1, 0, 1, 0};


    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        boolean[][] pStatus = new boolean[m][n];
        boolean[][] aStatus = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            dfs(i, 0, pStatus, m, n, heights);
            dfs(i, n - 1, aStatus, m, n, heights);
        }

        for (int j = 0; j < n; j++) {
            dfs(0, j, pStatus, m, n, heights);
            dfs(m - 1, j, aStatus, m, n, heights);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pStatus[i][j] && aStatus[i][j]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    result.add(list);
                }
            }
        }
        return result;
    }

    private void dfs(int i, int j, boolean[][] oceans, int m, int n, int[][] height) {
        if (oceans[i][j]) {
            return;
        }
        oceans[i][j] = true;
        for (int k = 0; k < 4; k++) {
            int xx = i + dx[k];
            int yy = j + dy[k];
            if (xx >= 0 && xx < m && yy >= 0 && yy < n && height[xx][yy] >= height[i][j]) {
                dfs(xx, yy, oceans, m, n, height);
            }
        }

    }
}
/**
 * 解答成功:
 * 执行耗时:4 ms,击败了88.22% 的Java用户
 * 内存消耗:43.1 MB,击败了41.03% 的Java用户
 */