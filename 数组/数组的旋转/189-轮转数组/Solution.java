class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] newNums = new int[len];
        for (int i = 0; i < len; i++) {
            newNums[(i + k) % len] = nums[i];
        }
        System.arraycopy(newNums, 0, nums, 0, len);
    }
}

/**
 * 执行耗时:1 ms,击败了64.54% 的Java用户
 * 内存消耗:56.7 MB,击败了37.61% 的Java用户
 */