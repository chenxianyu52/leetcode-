class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        // 非负的情况，最大的三个数；非正的情况，最大的三个数；有负有正，要么最大的三个数，要么最小两个数*最大数
        return Math.max(nums[len - 1] * nums[len - 2] * nums[len - 3], nums[0] * nums[1] * nums[len - 1]);
    }
}
/**
 * 解答成功:
 * 				执行耗时:11 ms,击败了70.87% 的Java用户
 * 				内存消耗:39.9 MB,击败了38.93% 的Java用户
 */