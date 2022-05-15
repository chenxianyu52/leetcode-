class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right && left < nums.length && right >= 0) {
            if (nums[left] == target && nums[right] == target) {
                break;
            }
            if (nums[left] != target) {
                left++;
            }
            if (nums[right] != target) {
                right--;
            }
        }

        if (left > right) {
            return new int[]{-1, -1};
        }

        return new int[]{left, right};

    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了10.52% 的Java用户
 * 内存消耗:44.7 MB,击败了26.98% 的Java用户
 */