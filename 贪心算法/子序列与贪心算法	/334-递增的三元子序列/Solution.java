class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            int j = i - 1;
            int k = i + 1;
            int temp = nums[i];
            while (j >= 0 && nums[j] >= temp) {
                j--;
            }
            while (k < nums.length && nums[k] <= temp) {
                k++;
            }
            if (j >= 0 && k < nums.length) {
                return true;
            }
        }
        return false;
    }
}
/**
 * Time Limit Exceeded
 */