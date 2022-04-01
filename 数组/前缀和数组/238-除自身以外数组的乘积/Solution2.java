class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] results = new int[len];
        results[0] = 1;
        for (int i = 1; i < len; i++) {
            results[i] = results[i - 1] * nums[i - 1];
        }
        int rightSum = 1;
        for (int i = len - 1; i >= 0; i--) {
            results[i] = results[i] * rightSum;
            rightSum *= nums[i];
        }

        return results;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:49.4 MB,击败了44.28% 的Java用户
 */