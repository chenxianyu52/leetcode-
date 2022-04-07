class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        int result = 0;
        int end = len;
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (end - i > 1) {
                    break;
                } else {
                    end = i;
                }
            } else {
                result++;
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39.7 MB,击败了23.11% 的Java用户
 */