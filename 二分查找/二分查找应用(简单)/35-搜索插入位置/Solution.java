class Solution {
    public int searchInsert(int[] nums, int target) {
        if (target < nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        int left = 0;
        int right = nums.length - 1;
        int middle = left + (right - left) / 2;
        while (nums[middle] != target) {
            if (nums[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
            if (left > right) {
                return right + 1;
            }
            middle = left + (right - left) / 2;
        }
        return middle;

    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:42.3 MB,击败了28.15% 的Java用户
 */