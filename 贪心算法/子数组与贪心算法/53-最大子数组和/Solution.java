class Solution {
    public int maxSubArray(int[] nums) {
        // f[i][j] = max(f[i+1][j])
        int len = nums.length;
        int[][] status = new int[len][len];
        int result = nums[0];
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (i == j) {
                    status[i][j] = nums[i];
                } else {
                    status[i][j] = status[i][j - 1] + nums[j];
                }
                result = Math.max(result, status[i][j]);
            }
        }
        return result;
    }
}
/**
 * Memory Limit Exceeded
 */