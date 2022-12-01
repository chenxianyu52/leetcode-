class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            int maxNum = i - 1;
            for (int j = 2; j < i; j++) {
//                System.out.println("j: " + j + ", dp[j]: " + dp[j]);
//                System.out.println("maxNum: " + maxNum);
                maxNum = Math.max(Math.max(maxNum, j * (i - j)), dp[j] * (i - j));
            }
            dp[i] = maxNum;
        }
        return dp[n];

    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了79.53% 的Java用户
 * 内存消耗:38.3 MB,击败了46.85% 的Java用户
 */