class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n != 0) {
            if (n == 1 || n % 2 == 0) {
                n /= 2;
            } else {
                return false;
            }
        }
        return true;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39 MB,击败了9.38% 的Java用户
 */