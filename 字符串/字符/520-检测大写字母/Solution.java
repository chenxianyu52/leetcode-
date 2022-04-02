class Solution {
    public boolean detectCapitalUse(String word) {
        /**
         * 全部字母都是大写，比如 "USA" 。
         * 单词中所有字母都不是大写，比如 "leetcode" 。
         * 如果单词不只含有一个字母，只有首字母大写， 比如 "Google" 。
         */
        int len = word.length();
        if (len == 0) {
            return false;
        }
        if (len == 1) {
            return true;
        }
        boolean isFirstSuper = Character.isUpperCase(word.charAt(0));
        int upperNumber = 0;
        for (int i = 1; i < len; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upperNumber++;
            }
        }
        if (isFirstSuper) {
            if (upperNumber == 0 || upperNumber == len - 1) {
                return true;
            } else {
                return false;
            }
        } else {
            if (upperNumber == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39.4 MB,击败了61.84% 的Java用户
 */