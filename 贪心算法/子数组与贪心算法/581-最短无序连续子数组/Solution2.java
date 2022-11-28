class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int len = nums.length;
        while (i < j && nums[i + 1] >= nums[i]) i++;
        while (i < j && nums[j - 1] <= nums[j]) j--;
        int left = i;
        int right = j;
        int min = nums[left];
        int max = nums[right];
        for (int k = left; k <= right; k++) {
            if (nums[k] < min) {
                while (i >= 0 && nums[i] > nums[k]) {
                    i--;
                }
                min = (i >= 0) ? nums[i] : Integer.MIN_VALUE;
            }
            if (nums[k] > max) {
                while (j < len && nums[j] < nums[k]) {
                    j++;
                }
                max = (j < len) ? nums[j] : Integer.MAX_VALUE;
            }
        }
        return j == i ? 0 : j - 1 - i;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:42.3 MB,击败了40.42% 的Java用户
 */