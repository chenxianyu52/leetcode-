class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(0, candidates, target, new ArrayList<>());
        return result;
    }

    private void dfs(int start, int[] candidates, int target, List<Integer> temp) {
        if (target == 0) {
            List<Integer> list = new ArrayList<>(temp);
            result.add(list);
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            int num = candidates[i];
            temp.add(num);
            dfs(i, candidates, target - num, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了78.54% 的Java用户
 * 内存消耗:41.5 MB,击败了91.29% 的Java用户
 */