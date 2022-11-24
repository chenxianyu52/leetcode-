class Solution {
    public int maxSubArray(int[] nums) {
        // f[i] = max(f[i - 1] + nums[i] , nums[i])
        int len = nums.length;
        int pre = nums[0];
        int result = nums[0];
        for (int i = 1; i < len; i++) {
            pre = Math.max(pre + nums[i], nums[i]);
            result = Math.max(result, pre);
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:50.9 MB,击败了31.46% 的Java用户
 */