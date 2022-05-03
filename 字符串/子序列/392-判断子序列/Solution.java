class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        int si = -1;  // [0..si] 为可匹配
        int ti = 0;
        int sLen = charS.length;
        if (sLen == 0) {
            return true;
        }
        int tLen = charT.length;
        while (ti < tLen) {
            if (si + 1 < sLen && charS[si + 1] == charT[ti]) {
                si++;
            }
            ti++;
        }
        if (si == sLen - 1) {
            return true;
        } else {
            return false;
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39.2 MB,击败了77.18% 的Java用户
 */