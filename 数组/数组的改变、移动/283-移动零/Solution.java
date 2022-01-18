class Solution {
    public void moveZeroes(int[] nums) {
        // 二次循环，最后将0补齐
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && i != j) {
                nums[j] = nums[i];
                j++;
            } else if (nums[i] != 0 && i == j) {
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
/**
 * 解答成功:
 * 					执行耗时:2 ms,击败了60.25% 的Java用户
 * 					内存消耗:39.6 MB,击败了57.02% 的Java用户
 */