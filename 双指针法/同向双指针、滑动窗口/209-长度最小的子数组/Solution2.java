class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = -1;
        int sum = 0;
        int result = len + 1;
        while (left < len) {
//            System.out.println("left: " + left + " right : " + right + " sum :" + sum);
            if (sum >= target) {
                result = Math.min(right - left + 1, result);
                sum -= nums[left];
                left++;
            } else {
                if (right + 1 < len) {
                    right++;
                    sum += nums[right];
                } else {
                    break;
                }
            }
        }
        if (result == len + 1) {
            return 0;
        } else {
            return result;
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了99.99% 的Java用户
 * 内存消耗:48.6 MB,击败了85.22% 的Java用户
 */