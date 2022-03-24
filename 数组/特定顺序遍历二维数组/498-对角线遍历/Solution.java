class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] results = new int[m * n];
        int[][] dreactions = {{-1, 1}, {1, -1}};
        int currentDireact = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < m * n; i++) {
            results[i] = mat[row][col];
            int nextRow = row + dreactions[currentDireact][0];
            int nextCol = col + dreactions[currentDireact][1];
            if (nextRow < 0 || nextRow >= m || nextCol < 0 || nextCol >= n) {
                if (currentDireact == 0) {
                    row += ((nextCol == n) ? 1 : 0);
                    col += ((nextCol == n) ? 0 : 1);
                } else {
                    row += ((nextRow == m) ? 0 : 1);
                    col += ((nextRow == m) ? 1 : 0);
                }
                currentDireact = (currentDireact + 1) % 2;
            } else {
                row = row + dreactions[currentDireact][0];
                col = col + dreactions[currentDireact][1];
            }
        }
        return results;
    }
}
/**
 * 解答成功:
 * 				执行耗时:3 ms,击败了44.02% 的Java用户
 * 				内存消耗:43 MB,击败了41.00% 的Java用户
 */