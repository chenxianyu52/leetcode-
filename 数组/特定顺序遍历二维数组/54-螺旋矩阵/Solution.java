class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> results = new ArrayList<Integer>();
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] direct = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        boolean[][] visited = new boolean[n][m];
        int sum = n * m;
        int row = 0;
        int clo = 0;
        int directIndex = 0;
        for (int i = 0; i < sum; i++) {
            results.add(matrix[row][clo]);
            visited[row][clo] = true;
            int nextRow = row + direct[directIndex][0];
            int nextClo = clo + direct[directIndex][1];
            if (nextRow >= n || nextRow < 0 || nextClo >= m || nextClo < 0 || visited[nextRow][nextClo]) {
                directIndex = (directIndex + 1) % 4;
            }
            row = row + direct[directIndex][0];
            clo = clo + direct[directIndex][1];
        }
        return results;
    }
}
/**
 * 解答成功:
 * 					执行耗时:0 ms,击败了100.00% 的Java用户
 * 					内存消耗:39.6 MB,击败了14.92% 的Java用户
 */