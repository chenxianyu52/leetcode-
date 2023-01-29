class Solution {
    public int countAsterisks(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int result = 0;
        while (i < chars.length) {
            while (i < chars.length && chars[i] != '|') {
                if (chars[i] == '*') {
                    result++;
                }
                i++;
            }
            i++;
            while (i < chars.length && chars[i] != '|') {
                i++;
            }
            i++;
        }
        return result;

    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:39.6 MB,击败了60.74% 的Java用户
 */