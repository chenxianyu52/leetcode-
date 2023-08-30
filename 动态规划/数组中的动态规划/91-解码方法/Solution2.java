class Solution {
    public int numDecodings(String s) {
        char[] chars = s.toCharArray();
        if (chars[0] == '0') {
            return 0;
        }
        int len = chars.length;
        int[] dp = new int[len + 1]; // 代表1～i的分割数量
        dp[0] = 1;
        for (int i = 1; i <= len; i++) {
            if (chars[i - 1] != '0') {
                dp[i] += dp[i - 1];
            }
            if (i > 1 && chars[i - 2] != '0' && (chars[i - 2] - '0') * 10 + (chars[i - 1] - '0') <= 26) {
                dp[i] += dp[i - 2];
            }
//            System.out.println("i: " + i + ", dp: " + dp[i]);
        }
        return dp[len];
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39.5 MB,击败了86.64% 的Java用户
 */