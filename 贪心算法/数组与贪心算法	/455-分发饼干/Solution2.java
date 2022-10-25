class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;
        for (int i = g.length - 1, j = s.length - 1; i >= 0 && j >= 0; ) {
            if (s[j] >= g[i]) {
                i--;
                j--;
                result++;
            } else {
                i--;
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:7 ms,击败了100.00% 的Java用户
 * 内存消耗:42.3 MB,击败了73.44% 的Java用户
 */