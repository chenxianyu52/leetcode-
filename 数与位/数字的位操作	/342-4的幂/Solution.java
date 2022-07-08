class Solution {
    public boolean isPowerOfFour(int n) {
        if (n == 1) {
            return true;
        }
        if (n <= 0) {
            return false;
        }

        int ceilTwo = (int) Math.sqrt(n);


        if (ceilTwo * ceilTwo == n && (ceilTwo & (ceilTwo - 1)) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.4 MB,击败了85.96% 的Java用户
 */