class Solution {
    public int countSubstrings(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        int result = len;
        char[] chars = s.toCharArray();

        for (int L = 2; L <= len; L++) {
            for (int i = 0; i <= len - L; i++) {
                int j = i + L - 1;
                if (chars[i] == chars[j]) {
                    if (j - i <= 1) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                    if (dp[i][j]) {
//                        System.out.println("i = " + i + " , j = " + j);
                        result++;
                    }
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return result;

    }
}
/**
 * 解答成功:
 * 执行耗时:8 ms,击败了52.51% 的Java用户
 * 内存消耗:41.8 MB,击败了12.54% 的Java用户
 */