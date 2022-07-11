class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        int max = (int) Math.pow(3, 19); // 找到3的幂的比Int.max 小的最大值
        return max % n == 0;
    }
}
/**
 * 解答成功:
 * 执行耗时:8 ms,击败了79.36% 的Java用户
 * 内存消耗:40.9 MB,击败了80.69% 的Java用户
 */