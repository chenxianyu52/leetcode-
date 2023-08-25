class Solution {
    public int jump(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < len; i++) {
            int sum = nums[i];
            for (int j = 1; j <= sum; j++) {
                if (i + j < len) {
                    dp[i + j] = Math.min(dp[i] + 1, dp[i + j]);
                } else {
                    break;
                }
            }
        }
        return dp[len - 1];
    }
}
/**
 * 解答成功:
 * 执行耗时:38 ms,击败了15.96% 的Java用户
 * 内存消耗:42.8 MB,击败了99.18% 的Java用户
 */