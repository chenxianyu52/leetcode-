class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int currentK = k % len;
        roll(nums, 0, len - 1);
        roll(nums, 0, currentK - 1);
        roll(nums, currentK, len - 1);
    }

    private void roll(int[] nums, int s, int e) {
        int start = s;
        int end = e;
        while (start < end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }
}
/**
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:57.3 MB,击败了5.24% 的Java用户
 */