class Solution {
    public int maxProduct(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i][i] = nums[i];
        }
        int max = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                dp[i][j] = dp[i][j - 1] * nums[j];
                max = Math.max(max, Math.max(dp[i][j], nums[j]));
            }
        }
        return max;
    }
}
/**
 * 运行失败:
 * Memory Limit Exceeded
 */