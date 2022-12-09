class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int newIndex = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != val) {
                if (i != newIndex) {
                    nums[newIndex] = nums[i];
                }
                newIndex++;
            }
        }
        return newIndex;

    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:40.2 MB,击败了22.85% 的Java用户
 */