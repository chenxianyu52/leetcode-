class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        char[] chars = s.toCharArray();
        int len = chars.length;
        String result = "";
        for (int i = 0; i < len; i++) {
            int left = i;
            int right = i;
            while (left >= 0 && chars[i] == chars[left]) {
                left--;
            }

            while (right < len && chars[i] == chars[right]) {
                right++;
            }

            while (left >= 0 && right < len) {
                if (chars[right] != chars[left]) {
                    break;
                } else {
                    left--;
                    right++;
                }
            }
//            System.out.println("i : " + i) ;
//            System.out.println("left : " + left + " , right : " + right) ;
            if (right - left - 2 + 1 > result.length()) {
                result = s.substring(left + 1, right);
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:11 ms,击败了91.57% 的Java用户
 * 内存消耗:41.4 MB,击败了73.82% 的Java用户
 */