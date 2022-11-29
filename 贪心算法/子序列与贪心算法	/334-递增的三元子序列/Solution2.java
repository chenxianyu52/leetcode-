class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int minOne = Integer.MAX_VALUE;
        int minSecond = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > minSecond) {
                return true;
            } else if (nums[i] < minSecond && nums[i] > minOne) {
                minSecond = nums[i];
            } else if (nums[i] < minOne) {
                minOne = nums[i];
            }
        }
        return false;
    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了38.54% 的Java用户
 * 内存消耗:91.7 MB,击败了5.14% 的Java用户
 */