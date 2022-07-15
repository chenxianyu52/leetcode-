public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        for (int i = 0; i < 32 && n != 0; i++) {
            if ((n & 1) == 1) {
                res++;
            }
            n >>>= 1;
        }
        return res;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.4 MB,击败了61.05% 的Java用户
 */