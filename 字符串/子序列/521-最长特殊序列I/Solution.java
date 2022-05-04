class Solution {
    public int findLUSlength(String a, String b) {
        if (a.length() > b.length()) {
            return a.length();
        } else if (a.length() < b.length()) {
            return b.length();
        } else {
            if (a.equals(b)) {
                return -1;
            } else {
                return a.length();
            }
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39 MB,击败了74.04% 的Java用户
 */