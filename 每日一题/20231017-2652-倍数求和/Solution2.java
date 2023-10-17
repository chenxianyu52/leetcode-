class Solution {
    public int sumOfMultiples(int n) {
        int[] tt = new int[]{3, 5, 7};
        if (n < 3) {
            return 0;
        }
        int result = 0;
        for (int i = 3; i <= n; i++) {
            for (int j = 0; j < 3; j++) {
                if (i % tt[j] == 0) {
                    result += i;
                    break;
                }
            }
        }
        return result;

    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了18.43% 的Java用户
 * 内存消耗:38.6 MB,击败了39.25% 的Java用户
 */