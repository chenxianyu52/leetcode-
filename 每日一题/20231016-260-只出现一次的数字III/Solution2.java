class Solution {
    public int[] singleNumber(int[] nums) {
        int x = 0;
        for (int num : nums) {
            x ^= num;
        }
        int and = x & -x;
        int a = 0;
        int b = 0;
        for (int num : nums) {
            if ((num & and) != 0) {
                a ^= num;
            }
        }
        b = x ^ a;
        return new int[]{a, b};

    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:43.2 MB,击败了69.36% 的Java用户
 */