class Solution {
    List<List<Integer>> result = new ArrayList<>();
    boolean[] status;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        status = new boolean[candidates.length];
        dfs(candidates, target, 0, new ArrayList<>());
        return result;
    }

    private void dfs(int[] candidates, int target, int start, List<Integer> temp) {
        if (target == 0) {
            List<Integer> list = new ArrayList<>(temp);
//            if(!result.contains(list)){
            result.add(list);
//            }
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            int num = candidates[i];
            if (i > 0 && candidates[i - 1] == num && !status[i - 1]) {
                continue;
            }
            temp.add(num);
            status[i] = true;
            dfs(candidates, target - num, i + 1, temp);
            status[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:4 ms,击败了45.50% 的Java用户
 * 内存消耗:42.2 MB,击败了14.69% 的Java用户
 */