class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int len = strs.length;
        Item[] items = new Item[len];
        for (int i = 0; i < len; i++) {
            items[i] = getItem(strs[i]);
        }
        int[][][] dp = new int[len + 1][m + 1][n + 1];
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k <= n; k++) {
                    dp[i][j][k] = dp[i - 1][j][k];
                    if (j >= items[i - 1].zeroNum && k >= items[i - 1].oneNum) {
                        dp[i][j][k] = Math.max(dp[i][j][k], dp[i - 1][j - items[i - 1].zeroNum][k - items[i - 1].oneNum] + 1);
                    }
                }
            }
        }
        return dp[len][m][n];

    }

    private Item getItem(String str) {
        Item item = new Item();
        item.str = str;
        int zeroNum = 0;
        int oneNum = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                zeroNum++;
            }
            if (chars[i] == '1') {
                oneNum++;
            }
        }
        item.zeroNum = zeroNum;
        item.oneNum = oneNum;
        return item;
    }

    class Item {
        public String str;
        public int zeroNum;
        public int oneNum;
    }
}
/**
 * 解答成功:
 * 执行耗时:80 ms,击败了5.03% 的Java用户
 * 内存消耗:71.7 MB,击败了5.02% 的Java用户
 */