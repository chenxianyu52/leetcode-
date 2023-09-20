class Solution {
    public int minCount(int[] coins) {
        int result = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] % 2 == 0) {
                result += (coins[i] / 2);
            } else {
                result += (coins[i] / 2 + 1);
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.7 MB,击败了57.77% 的Java用户
 */