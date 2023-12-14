class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        int[][] dp = new int[len][len];
        List<Integer> last = triangle.get(len - 1);
        for (int i = 0; i < len; i++) {
            dp[len - 1][i] = last.get(i);
        }
        for (int i = len - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i + 1][j], dp[i + 1][j + 1]);
            }
        }
        return dp[0][0];

    }
}
/**
 * 解答成功:
 * 执行耗时:4 ms,击败了37.97% 的Java用户
 * 内存消耗:43 MB,击败了20.92% 的Java用户
 */