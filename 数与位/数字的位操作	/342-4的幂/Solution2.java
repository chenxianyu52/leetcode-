class Solution {
    public boolean isPowerOfFour(int n) {
        if (n == 1) {
            return true;
        }
        if (n <= 0) {
            return false;
        }

        if (((n & (n - 1)) == 0) && (n % 3 == 1)) {
            return true;
        } else {
            return false;
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.5 MB,击败了67.38% 的Java用户
 */