class Solution {
    public int arrangeCoins(int n) {
        int left = 1;
        int right = n;
        int middle = left + (right - left) / 2;
        while (left <= right) {
            long sum = (long) (1 + middle) * middle / 2;
            if (sum == n) {
                return middle;
            } else if (sum > n) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
            middle = left + (right - left) / 2;
        }
        return right;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:38.6 MB,击败了65.90% 的Java用户
 */