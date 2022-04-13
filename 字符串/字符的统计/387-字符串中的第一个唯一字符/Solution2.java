class Solution {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int len = s.length();
        int[] sums = new int[26];
        for (int i = 0; i < len; i++) {
            sums[chars[i] - 'a']++;
        }
        for (int i = 0; i < len; i++) {
            char c = chars[i];
            if (sums[c - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
/**
 * 用了hash表，发现速度很慢，然后用了toCharArray速度比charAt更快一点
 * 解答成功:
 * 执行耗时:3 ms,击败了98.68% 的Java用户
 * 内存消耗:41.7 MB,击败了49.56% 的Java用户
 */