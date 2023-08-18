class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        int middle = left + (right - left) / 2;
        while (left <= right) {
            long middle2 = (long) middle * middle;
            if (middle2 == (long) num) {
                return true;
            } else if (middle2 < (long) num) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
            middle = left + (right - left) / 2;
        }
        return false;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38 MB,击败了82.90% 的Java用户
 */