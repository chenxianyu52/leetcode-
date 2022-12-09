class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int newIndex = 0;
        for (int i = 0; i < len; ) {
            while (i > 0 && i < len && nums[i] == nums[i - 1]) {
                i++;
            }
            if (i < len) {
                nums[newIndex++] = nums[i++];
            }
        }
        return newIndex;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了22.88% 的Java用户
 * 内存消耗:43.3 MB,击败了30.17% 的Java用户
 */