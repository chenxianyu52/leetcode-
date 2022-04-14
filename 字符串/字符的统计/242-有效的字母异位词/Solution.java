class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        int[] status = new int[26];
        for (char c : sChars) {
            status[c - 'a']++;
        }
        char[] tChars = t.toCharArray();
        for (char c : tChars) {
            status[c - 'a']--;
            if (status[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:41.6 MB,击败了33.37% 的Java用户
 */