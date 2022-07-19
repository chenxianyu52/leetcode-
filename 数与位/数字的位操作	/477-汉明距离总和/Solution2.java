class Solution {
    public int totalHammingDistance(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                res += Integer.bitCount(nums[i] ^ nums[j]);
            }
        }
        return res;
    }
}
/**
 * 解答成功:
 * 执行耗时:2003 ms,击败了5.74% 的Java用户
 * 内存消耗:42.1 MB,击败了56.38% 的Java用户
 */