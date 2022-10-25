class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j = 0;
        int result = 0;
        for (int i = 0; i < g.length; i++) {
            while (j < s.length) {
                if (s[j] >= g[i]) {
                    j++;
                    result++;
                    break;
                } else {
                    j++;
                }
            }
            if (j >= s.length) {
                break;
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:8 ms,击败了26.23% 的Java用户
 * 内存消耗:42.4 MB,击败了57.27% 的Java用户
 */