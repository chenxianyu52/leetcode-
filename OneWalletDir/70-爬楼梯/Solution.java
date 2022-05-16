class Solution {
    private int[] cache = new int[46];

    public int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (cache[n] > 0) {
            return cache[n];
        }
        int res = climbStairs(n - 1) + climbStairs(n - 2);
        cache[n] = res;
        return res;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.3 MB,击败了25.42% 的Java用户
 */