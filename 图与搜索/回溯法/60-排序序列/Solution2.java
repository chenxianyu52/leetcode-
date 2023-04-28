class Solution {
    String result;
    int tempK;

    public String getPermutation(int n, int k) {
        tempK = k;
        dfs(n, new StringBuilder(), new boolean[n + 1]);
        return result;
    }

    private void dfs(int n, StringBuilder sb, boolean[] status) {
        if (tempK < 1) {
            return;
        }
        if (sb.length() == n) {
//            System.out.println("s: " + s + " ,tempK : " + tempK);
            if (tempK == 1) {
                result = sb.toString();
                tempK--;
            } else {
                tempK--;
            }
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!status[i]) {
                sb.append(i);
                status[i] = true;
                dfs(n, sb, status);
                status[i] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:512 ms,击败了23.61% 的Java用户
 * 内存消耗:38.9 MB,击败了66.75% 的Java用户
 */