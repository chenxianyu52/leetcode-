public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int middle = left + (right - left) / 2;
        while (left < right) {
            if (isBadVersion(middle)) {
                right = middle;
            } else {
                left = middle + 1;
            }
            middle = left + (right - left) / 2;
        }
        return middle;
    }
}
/**
 * 解答成功:
 * 执行耗时:13 ms,击败了93.92% 的Java用户
 * 内存消耗:38.2 MB,击败了26.62% 的Java用户
 */