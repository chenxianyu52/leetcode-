class Solution {
    public int findSubstringInWraproundString(String p) {
        char[] chars = p.toCharArray();
        int len = chars.length;
        int[] statusSum = new int[26];
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (i > 0 && (chars[i] - chars[i - 1] - 1) % 26 == 0) {
                count++;
            } else {
                count = 1;
            }
            statusSum[chars[i] - 'a'] = Math.max(statusSum[chars[i] - 'a'], count);
        }
        int result = 0;
        for (int i = 0; i < 26; i++) {
            result += statusSum[i];
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:4 ms,击败了79.02% 的Java用户
 * 内存消耗:40.8 MB,击败了82.83% 的Java用户
 */