class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了96.57% 的Java用户
 * 内存消耗:41.2 MB,击败了73.89% 的Java用户
 */