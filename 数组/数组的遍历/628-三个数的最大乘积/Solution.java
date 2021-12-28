class Solution {
    public int maximumProduct(int[] nums) {
        long result = Long.MIN_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    long temp = nums[i] * nums[j] * nums[k];
                    if (temp > result) {
                        result = temp;
                    }
                }
            }
        }
        return (int) result;
    }
}
/**
 * 运行失败:
 * 				Time Limit Exceeded
 */