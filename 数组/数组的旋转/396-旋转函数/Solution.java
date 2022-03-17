class Solution {
    public int maxRotateFunction(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return 0;
        }
        int maxSum = Integer.MIN_VALUE;
        for (int k = 0; k < len; k++) {
            int currentIndex = (len + k) % len;
            int preSum = 0;
            for (int i = 0; i < len; i++) {
                preSum += (i * nums[(currentIndex + i) % len]);
            }
            if (preSum > maxSum) {
                maxSum = preSum;
            }
        }
        return maxSum;

    }
}
/**
 * 运行失败:
 * 	Time Limit Exceeded
 */