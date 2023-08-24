class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] sum = new int[n + 1];
        sum[0] = 0;
        sum[1] = 1;
        sum[2] = 2;
        for (int i = 3; i <= n; i++) {
            sum[i] = sum[i - 1] + sum[i - 2];
        }
        return sum[n];
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:37.7 MB,击败了98.39% 的Java用户
 */