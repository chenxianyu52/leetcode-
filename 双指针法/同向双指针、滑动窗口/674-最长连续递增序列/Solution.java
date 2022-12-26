class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = 1;
        int result = 1;
        for (int i = 1; i < len; i++) {
            if (nums[i] > nums[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = 1;
            }
            result = Math.max(dp[i], result);
        }
        return result;

    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了99.93% 的Java用户
 * 内存消耗:42.1 MB,击败了38.35% 的Java用户
 */