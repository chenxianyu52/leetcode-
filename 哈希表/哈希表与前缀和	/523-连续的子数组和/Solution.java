class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length < 2) {
            return false;
        }
        int len = nums.length;
        for (int L = 2; L <= len; L++) {
            int sum = 0;
            for (int i = 0; i < L; i++) {
                sum += nums[i];
            }
            if (sum % k == 0) {
                return true;
            }
            for (int i = 0; i < len - L; i++) {
//                System.out.println("sum : " + sum);
                sum += nums[i + L];
                sum -= nums[i];
                if (sum % k == 0) {
                    return true;
                }
            }
        }

        return false;

    }
}
/**
 * Time Limit Exceeded
 */