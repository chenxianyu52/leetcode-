class Solution {
    public int countBinarySubstrings(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        int result = 0;
        if (len <= 1) {
            return result;
        }
        int pre = 0;
        int last = 0;
        for (int i = 0; i < len; ) {
            char temp = chars[i];
            while (i < len && chars[i] == temp) {
                i++;
                last++;
            }
            result += Math.min(pre, last);
            pre = last;
            last = 0;
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:6 ms,击败了99.13% 的Java用户
 * 内存消耗:42 MB,击败了17.54% 的Java用户
 */