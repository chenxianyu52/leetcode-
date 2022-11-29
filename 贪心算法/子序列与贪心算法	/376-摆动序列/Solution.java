class Solution {
    public int wiggleMaxLength(int[] nums) {
        int len = nums.length;
        if (nums.length < 2) {
            return nums.length;
        }
        int[] up = new int[len];
        int[] down = new int[len];
        up[0] = down[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                up[i] = up[i - 1];
                down[i] = Math.max(up[i - 1] + 1, down[i - 1]);
            } else if (nums[i] > nums[i - 1]) {
                up[i] = Math.max(down[i - 1] + 1, up[i - 1]);
                down[i] = down[i - 1];
            } else {
                up[i] = up[i - 1];
                down[i] = down[i - 1];
            }
        }
        return Math.max(up[len - 1], down[len - 1]);
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39.1 MB,击败了44.05% 的Java用户
 */