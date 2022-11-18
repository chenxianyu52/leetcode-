class Solution {
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while (true) {
            int temp = quick(nums, left, right);
            if (temp == len - k) {
                return nums[temp];
            } else if (temp > len - k) {
                right = temp - 1;
            } else {
                left = temp + 1;
            }
        }

    }

    private int quick(int[] nums, int left, int right) {
        int x = nums[left];
        while (left < right) {
            while (left < right && nums[right] > x) {
                right--;
            }
            if (left < right) {
                nums[left++] = nums[right];
            }
            while (left < right && nums[left] < x) {
                left++;
            }
            if (left < right) {
                nums[right--] = nums[left];
            }
        }
        nums[left] = x;
        return left;
    }
}
/**
 * 解答成功:
 * 执行耗时:11 ms,击败了73.05% 的Java用户
 * 内存消耗:48.6 MB,击败了92.62% 的Java用户
 */