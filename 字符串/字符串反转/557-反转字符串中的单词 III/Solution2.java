class Solution {
    public String reverseWords(String s) {
        char[] sChars = s.toCharArray();
        int len = sChars.length;
        int start = 0;
        for (int i = 1; i < len; i++) {
            if (sChars[i] == ' ') {
                revese(sChars, start, i - 1);
                start = i + 1;
            }
        }
        revese(sChars, start, len - 1);
        return new String(sChars);
    }

    private void revese(char[] sChar, int start, int end) {
        while (start < end) {
            char temp = sChar[start];
            sChar[start] = sChar[end];
            sChar[end] = temp;
            start++;
            end--;
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了100.00% 的Java用户
 * 内存消耗:42 MB,击败了21.10% 的Java用户
 */