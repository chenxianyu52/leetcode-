class Solution {
    int result = 0;

    public int numDecodings(String s) {
        char[] chars = s.toCharArray();
        if (chars[0] == '0') {
            return 0;
        }
        int len = chars.length;
        dfs(chars, 0);
        return result;
    }

    private void dfs(char[] chars, int start) {
        if (start >= chars.length) {
            result++;
            return;
        }
        if (chars[start] == '0') {
            return;
        }
        dfs(chars, start + 1);
        if (start + 1 < chars.length && ((chars[start] - '0') * 10 + (chars[start + 1] - '0')) <= 26) {
            dfs(chars, start + 2);
        }
    }
}
/**
 * 运行失败:
 * Time Limit Exceeded
 * 测试用例:"111111111111111111111111111111111111111111111"
 */