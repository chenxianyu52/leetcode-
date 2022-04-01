class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] results = new int[len];
        long sum = 1;
        int zeroNum = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                zeroNum++;
            } else {
                sum *= nums[i];
            }
            if (zeroNum >= 2) {
                return results;
            }
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                results[i] = (int) sum;
            } else {
                if (zeroNum > 0) {
                    results[i] = 0;
                } else {
                    results[i] = (int) (sum / nums[i]);
                }
            }
        }
        return results;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:49.4 MB,击败了46.45% 的Java用户
 */