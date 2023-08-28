class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int rightMost = 0;
        for (int i = 0; i < len; i++) {
            if (i <= rightMost) {
                rightMost = Math.max(rightMost, i + nums[i]);
                if (rightMost >= len - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了89.07% 的Java用户
 * 内存消耗:42.6 MB,击败了77.64% 的Java用户
 */