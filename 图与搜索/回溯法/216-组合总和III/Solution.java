class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(1, k, n, new ArrayList<>());
        return result;
    }

    private void dfs(int start, int k, int n, List<Integer> temp) {
        if (k == 0 && n == 0) {
            List<Integer> list = new ArrayList<>(temp);
            result.add(list);
            return;
        }
        if (k < 0 || n < 0) {
            return;
        }

        for (int i = start; i <= 9; i++) {
            temp.add(i);
            dfs(i + 1, k - 1, n - i, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39.1 MB,击败了57.48% 的Java用户
 */