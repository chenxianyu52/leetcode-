class Solution {
    public int waysToMakeFair(int[] nums) {
        int preJi = 0;
        int preOu = 0;
        int lastJi = 0;
        int lastOu = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                lastOu += nums[i];
            } else {
                lastJi += nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                lastOu -= nums[i];
            } else {
                lastJi -= nums[i];
            }
            if (preJi + lastOu == preOu + lastJi) {
                result++;
            }
            if (i % 2 == 0) {
                preOu += nums[i];
            } else {
                preJi += nums[i];
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:6 ms,击败了52.63% 的Java用户
 * 内存消耗:51.6 MB,击败了36.84% 的Java用户
 */