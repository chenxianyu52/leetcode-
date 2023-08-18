class Solution {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            long middle = (long) mid * mid;
            if (middle == x) {
                return mid;
            } else if (middle > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            mid = left + (right - left) / 2;
        }
        return right;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了94.36% 的Java用户
 * 内存消耗:38.6 MB,击败了41.80% 的Java用户
 */