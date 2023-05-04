class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        dfs(nums, 0, new ArrayList<>());
        return result;
    }

    private void dfs(int[] nums, int start, List<Integer> temp) {
        if (temp.size() >= 2) {
            List<Integer> list = new ArrayList<>(temp);
            result.add(list);
        }

        Set<Integer> set = new HashSet<>();
        for (int i = start; i < nums.length; i++) {
            int num = nums[i];
            if (set.contains(num)) {
                continue;
            }
            if (temp.size() > 0 && num < temp.get(temp.size() - 1)) {
                continue;
            }

            set.add(num);
            temp.add(num);
            dfs(nums, i + 1, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:5 ms,击败了63.67% 的Java用户
 * 内存消耗:49.1 MB,击败了11.78% 的Java用户
 */