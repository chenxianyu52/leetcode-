class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                dp[i] = nums[i];
            } else if (i == 1) {
                dp[i] = Math.max(nums[i], dp[i - 1]);
            } else {
                dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
            }
        }
        return dp[len - 1];
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.9 MB,击败了20.94% 的Java用户
 */