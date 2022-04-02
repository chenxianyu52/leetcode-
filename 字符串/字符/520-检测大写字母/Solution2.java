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
        boolean isSecondSuper = Character.isUpperCase(word.charAt(1));
        if (!isFirstSuper && isSecondSuper) {
            return false;
        }
        for (int i = 2; i < len; i++) {
            if (Character.isUpperCase(word.charAt(i)) != Character.isUpperCase(word.charAt(1))) {
                return false;
            }
        }
        return true;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了68.21% 的Java用户
 * 内存消耗:39.7 MB,击败了37.38% 的Java用户
 */