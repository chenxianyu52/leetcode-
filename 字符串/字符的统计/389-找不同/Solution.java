class Solution {
    public char findTheDifference(String s, String t) {
        int[] status = new int[26];
        int sLen = s.length();
        int tLen = t.length();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for (int i = 0; i < sLen; i++) {
            status[sChars[i] - 'a']++;
        }

        for (int i = 0; i < tLen; i++) {
            status[tChars[i] - 'a']--;
            if (status[tChars[i] - 'a'] < 0) {
                return tChars[i];
            }
        }
        return 'a';
    }
}

/**
 * 解答成功:
 * 执行耗时:1 ms,击败了99.08% 的Java用户
 * 内存消耗:39.6 MB,击败了41.61% 的Java用户
 */