class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        Arrays.sort(nums);
        int halfSum = sum / 2;
        boolean[][] dp = new boolean[nums.length][halfSum + 1];
        for (int i = 0; i < nums.length; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j <= halfSum; j++) {
                dp[i][j] = dp[i - 1][j];
                if (nums[i] <= j) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - nums[i]];
                }
            }
            if (dp[i][halfSum]) {
                return true;
            }
        }
        return dp[nums.length - 1][halfSum];

    }
}
/**
 * 解答成功:
 * 执行耗时:43 ms,击败了20.38% 的Java用户
 * 内存消耗:44 MB,击败了18.98% 的Java用户
 */