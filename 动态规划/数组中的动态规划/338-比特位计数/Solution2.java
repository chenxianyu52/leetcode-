class Solution {
    public int[] countBits(int n) {
        int[] status = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                status[i] = status[i / 2];
            } else {
                status[i] = status[i / 2] + 1;
            }
        }
        return status;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了99.87% 的Java用户
 * 内存消耗:45.3 MB,击败了31.65% 的Java用户
 */