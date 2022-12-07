class Solution {
    public boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {
                return validPalid(chars, left + 1, right) || validPalid(chars, left, right - 1);
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    private boolean validPalid(char[] chars, int start, int end) {
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
/**
 * 解答成功:
 * 执行耗时:5 ms,击败了76.40% 的Java用户
 * 内存消耗:41.9 MB,击败了69.03% 的Java用户
 */