class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];//[i,j]是回文
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        char[] chars = s.toCharArray();

        int maxLeft = 0;
        int maxRight = 0;
        for (int L = 2; L <= len; L++) {
            for (int i = 0; i < len - L + 1; i++) {
                int j = i + L - 1;
                if (chars[i] == chars[j]) {
                    if (j - i == 1) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                    if (dp[i][j] && j - i > maxRight - maxLeft) {
                        maxLeft = i;
                        maxRight = j;
                    }

                } else {
                    dp[i][j] = false;
                }
            }
        }
        return s.substring(maxLeft, maxRight + 1);
    }
}
/**
 * 解答成功:
 * 执行耗时:141 ms,击败了46.80% 的Java用户
 * 内存消耗:45.1 MB,击败了23.86% 的Java用户
 */