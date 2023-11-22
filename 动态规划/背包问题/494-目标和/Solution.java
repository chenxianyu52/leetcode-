class Solution {
    int result = 0;

    public int findTargetSumWays(int[] nums, int target) {
        dfs(nums, 0, target, 0);
        return result;
    }

    private void dfs(int[] nums, int start, int target, int pre) {
        if (start == nums.length) {
            if (pre == target) {
                result++;
            }
            return;
        }
        int num = nums[start];
        dfs(nums, start + 1, target, pre + num);
        dfs(nums, start + 1, target, pre - num);
    }
}
/**
 * 解答成功:
 * 执行耗时:580 ms,击败了8.86% 的Java用户
 * 内存消耗:39.4 MB,击败了31.60% 的Java用户
 */