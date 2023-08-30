class Solution {
    public int minSteps(int n) {
        int[] status = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            status[i] = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    status[i] = Math.min(status[i], status[j] + i / j);
                    status[i] = Math.min(status[i], status[i / j] + j);
                }
            }
        }
        return status[n];
    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了61.65% 的Java用户
 * 内存消耗:38.3 MB,击败了51.03% 的Java用户
 */