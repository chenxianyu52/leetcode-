class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:48.3 MB,击败了15.71% 的Java用户
 */