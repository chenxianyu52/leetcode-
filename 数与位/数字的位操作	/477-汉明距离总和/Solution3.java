class Solution {
    public int totalHammingDistance(int[] nums) {
        int res = 0;
        int len = nums.length;
        for (int i = 0; i < 30; i++) {
            int c = 0;
            for (int num : nums) {
                c += (num >> i) & 1;
            }
            res += c * (len - c);
        }
        return res;
    }
}
/**
 * 解答成功:
 * 执行耗时:4 ms,击败了83.62% 的Java用户
 * 内存消耗:42.2 MB,击败了35.96% 的Java用户
 */