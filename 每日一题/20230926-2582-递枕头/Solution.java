class Solution {
    public int passThePillow(int n, int time) {
        int p = time % (2 * (n - 1));
        if (p <= n - 1) {
            return p + 1;
        } else {
            return n - (p - n) - 1;
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.1 MB,击败了53.43% 的Java用户
 */