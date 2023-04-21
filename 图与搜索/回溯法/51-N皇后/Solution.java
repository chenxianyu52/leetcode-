class Solution {
    List<List<String>> result = new ArrayList<>();
    boolean[] status;
    boolean[] xie1;
    boolean[] xie2;

    public List<List<String>> solveNQueens(int n) {
        status = new boolean[n + 1];
        xie1 = new boolean[n * 2 - 1];
        xie2 = new boolean[n * 2 - 1];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append('.');
        }
        dfs(1, n, new ArrayList<>(), sb.toString());
        return result;
    }

    private boolean dfs(int row, int n, List<String> temp, String ss) {
        if (row > n) {
            result.add(temp);
            return true;
        }
        for (int i = 1; i <= n; i++) {
//            System.out.println("i: " + i);
            if (!status[i] && !xie1[row - i + n - 1] && !xie2[i + row - 2]) {
                status[i] = true;
                xie1[row - i + n - 1] = true;
                xie2[i + row - 2] = true;
                StringBuilder sb = new StringBuilder(ss);
                sb.setCharAt(i - 1, 'Q');
                List<String> copy = new ArrayList<>(temp);
                copy.add(sb.toString());
                dfs(row + 1, n, copy, ss);
                xie1[row - i + n - 1] = false;
                xie2[i + row - 2] = false;
                status[i] = false;
            }
        }
        return false;
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了90.48% 的Java用户
 * 内存消耗:42.5 MB,击败了5.24% 的Java用户
 */