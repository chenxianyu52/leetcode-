class Solution {
    public int longestPalindrome(String s) {
        int[] status = new int[128];
        int len = s.length();
        int result = 0;
        for (int i = 0; i < len; i++) {
            status[s.charAt(i)]++;
        }
        for (int sum : status) {
            result += sum / 2 * 2;
            if (result % 2 == 0 && sum % 2 == 1) {
                result++;
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:39.5 MB,击败了73.89% 的Java用户
 */