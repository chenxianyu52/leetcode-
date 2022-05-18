class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        boolean[] dp = new boolean[len + 1];// dp[i] = dp[j] && check(j...i)
        dp[0] = true;  // 这个边界是重点
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
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
 * 执行耗时:7 ms,击败了59.34% 的Java用户
 * 内存消耗:41.6 MB,击败了37.42% 的Java用户
 */