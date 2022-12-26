class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        for (int T = 1; T <= len; T++) {
            int left = 0;
            int right = -1;
            int sum = 0;
            while (left < len) {
//                System.out.println("left: " + left + " , right : " + right + " sum : " + sum);
                if (right + 1 < len && right - left < T - 1) {
                    right++;
                    sum += nums[right];
                } else {
                    if (sum >= target) {
                        return T;
                    }
                    sum -= nums[left];
                    left++;
                }
            }
        }

        return 0;

    }
}
/**
 * Time Limit Exceeded
 */