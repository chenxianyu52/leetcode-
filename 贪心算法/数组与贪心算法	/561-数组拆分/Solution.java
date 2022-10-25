class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            result += nums[i];
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:12 ms,击败了97.18% 的Java用户
 * 内存消耗:43.8 MB,击败了20.70% 的Java用户
 */