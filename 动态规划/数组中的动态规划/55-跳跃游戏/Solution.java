class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        boolean[] status = new boolean[len];
        status[0] = true;
        for (int i = 0; i < len; i++) {
            int sum = nums[i];
            for (int j = 0; j <= sum && i + j < len; j++) {
                if (status[i + j]) {
                    continue;
                } else {
                    status[i + j] = status[i];
                }
            }
        }
        return status[len - 1];
    }
}
/**
 * 解答成功:
 * 执行耗时:412 ms,击败了5.26% 的Java用户
 * 内存消耗:43.1 MB,击败了5.05% 的Java用户
 */