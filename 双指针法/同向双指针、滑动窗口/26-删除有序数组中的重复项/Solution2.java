class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int newIndex = 1;
        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[newIndex - 1]) {
                nums[newIndex++] = nums[i];
            }
        }
        return newIndex;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:42.9 MB,击败了71.17% 的Java用户
 */