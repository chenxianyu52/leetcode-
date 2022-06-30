class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }
        char[] chars1 = haystack.toCharArray();
        int lenChars1 = chars1.length;
        char[] chars2 = needle.toCharArray();
        int lenChars2 = chars2.length;
        int i = 0;
        while (i <= lenChars1 - lenChars2) {
            int j = 0;
            boolean isMatch = false;
            while (j < lenChars2) {
                if (chars1[i + j] != chars2[j]) {
                    isMatch = false;
                    break;
                } else {
                    isMatch = true;
                }
                j++;
            }
            if (isMatch) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39.6 MB,击败了33.24% 的Java用户
 */