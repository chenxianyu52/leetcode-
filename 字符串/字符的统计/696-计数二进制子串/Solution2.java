class Solution {
    public int countBinarySubstrings(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        int result = 0;
        if (len <= 1) {
            return result;
        }
        for (int i = 1; i < len; i++) {
            if (chars[i] == chars[i - 1]) {
                continue;
            }
            // 肯定已经有一个了
            result++;

            int start = i - 2;
            int end = i + 1;
            while (start >= 0 && end <= len - 1) {
                if (chars[start] == chars[i - 1] && chars[end] == chars[i]) {
                    start--;
                    end++;
                    result++;
                } else {
                    break;
                }
            }
        }
        return result;

    }
}
/**
 * 解答成功:
 * 执行耗时:6 ms,击败了99.13% 的Java用户
 * 内存消耗:41.8 MB,击败了46.81% 的Java用户
 */