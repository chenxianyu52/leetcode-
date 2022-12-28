class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int[] status = new int[128];
        int len = chars.length;
        int left = 0;
        int right = -1;
        int result = 0;
        int temp = 0;
        while (left < len) {
            if (right + 1 < len && status[chars[right + 1]] == 0) {
                right++;
                status[chars[right]]++;
                temp++;
                result = Math.max(temp, result);
            } else {
                status[chars[left]]--;
                left++;
                temp--;
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:41.6 MB,击败了54.58% 的Java用户
 */