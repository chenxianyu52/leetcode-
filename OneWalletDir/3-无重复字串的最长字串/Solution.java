class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int len = s.length();
        int[] status = new int[129];
        int left = 0;
        int right = -1;// [left.. right] 为无重复子串；
        int result = 0;
        while (left < len) {
            if (right + 1 < len) {
//                System.out.println("right: " + chars[right + 1] + " , index : " + right);
//                System.out.println("left: " + chars[left] + " , index : " + left);
                if (status[chars[right + 1]] == 0) {
                    status[chars[right + 1]]++;
                    right++;
                    result = Math.max(result, right - left + 1);
                } else {
                    status[chars[left]]--;
                    left++;
                }
            } else {
                status[chars[left]]--;
                left++;
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:41.5 MB,击败了54.05% 的Java用户
 */