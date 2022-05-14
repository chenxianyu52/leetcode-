class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        char[] chars = s.toCharArray();
        int len = chars.length;
        boolean[][] dp = new boolean[len][len]; // dp[i][j] 标记i...j是否是回文
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        int maxStart = 0;
        int maxEnd = 0;
        for (int L = 2; L <= len; L++) {
            for (int i = 0; i + L - 1 < len; i++) {
                int j = i + L - 1;
                if (chars[i] == chars[j]) {
                    if (j - i == 1) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                    if (dp[i][j]) {
                        if (j - i > maxEnd - maxStart) {
                            maxEnd = j;
                            maxStart = i;
                        }
                    }
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return s.substring(maxStart, maxEnd + 1);
    }
}
/**
 * 解答成功:
 * 执行耗时:140 ms,击败了47.27% 的Java用户
 * 内存消耗:44.4 MB,击败了36.50% 的Java用户
 */