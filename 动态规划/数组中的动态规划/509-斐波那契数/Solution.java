class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int[] sum = new int[n + 1];
        sum[0] = 0;
        sum[1] = 1;
        for (int i = 2; i <= n; i++) {
            sum[i] = sum[i - 1] + sum[i - 2];
        }
        return sum[n];

    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.3 MB,击败了17.97% 的Java用户
 */