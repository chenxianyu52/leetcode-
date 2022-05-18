class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        boolean[] dp = new boolean[len + 1];// dp[i] = dp[j] && check(j...i)
        dp[0] = true;  // 这个边界是重点
        for (int i = 1; i <= len; i++) {
            for (String word : wordDict) {
                int j = i - word.length();
                if (j >= 0 && dp[j] && word.equals(s.substring(j, i))) {
//                    System.out.println("i: " + i + " , j: " + j + ", dp[j]: " + dp[j]);
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[len];
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了92.98% 的Java用户
 * 内存消耗:39.6 MB,击败了92.09% 的Java用户
 */