class Solution {
    public int firstUniqChar(String s) {
        int len = s.length();
        int[] sums = new int[26];
        for (int i = 0; i < len; i++) {
            sums[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (sums[c - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
/**
 * 解答成功:
 * 执行耗时:4 ms,击败了91.76% 的Java用户
 * 内存消耗:41.8 MB,击败了31.79% 的Java用户
 */