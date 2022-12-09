class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (nums.length <= 2) {
            return len;
        }
        int newIndex = 2;
        for (int i = 2; i < len; i++) {
            if (nums[i] != nums[newIndex - 2]) {
                nums[newIndex++] = nums[i];
            }
        }
        return newIndex;

    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41.9 MB,击败了25.41% 的Java用户
 */