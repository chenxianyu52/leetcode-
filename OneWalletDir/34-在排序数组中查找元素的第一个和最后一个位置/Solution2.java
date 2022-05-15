class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int leftResult = -1;
        int rightResult = -1;
        // 最左边
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] >= target) {
                right = mid - 1;
            }
        }

        if (left >= 0 && left <= nums.length - 1 && target == nums[left]) {
            leftResult = left;
        }

        left = 0;
        right = nums.length - 1;

        // 最右边
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }

        if (right >= 0 && right <= nums.length - 1 && target == nums[right]) {
            rightResult = right;
        }

        return new int[]{leftResult, rightResult};

    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:44.8 MB,击败了12.92% 的Java用户
 */