class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (num <= i) {
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了98.12% 的Java用户
 * 内存消耗:39.1 MB,击败了5.03% 的Java用户
 */