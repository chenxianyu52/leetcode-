class Solution {
    String result;
    int tempK;

    public String getPermutation(int n, int k) {
        tempK = k;
        dfs(n, "", new boolean[n + 1]);
        return result;
    }

    private void dfs(int n, String s, boolean[] status) {
        if (tempK < 1) {
            return;
        }
        if (s.length() == n) {
//            System.out.println("s: " + s + " ,tempK : " + tempK);
            if (tempK == 1) {
                result = s;
                tempK--;
            } else {
                tempK--;
            }
            return;
        }

        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder(s);
            if (!status[i]) {
                sb.append(i);
                status[i] = true;
                dfs(n, sb.toString(), status);
                status[i] = false;
            }
        }
    }
}
/**
 * 运行失败:
 * Time Limit Exceeded
 */