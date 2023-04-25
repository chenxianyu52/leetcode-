class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        Set<Integer> set = new HashSet<>();
        dfs(nums, set, 0, new ArrayList<>());
        return result;
    }

    private void dfs(int[] nums, Set<Integer> set, int n, List<Integer> temp) {
        if (n == nums.length) {
            List<Integer> list = new ArrayList<>(temp);
            result.add(list);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                continue;
            }
            int num = nums[i];
            set.add(num);
            temp.add(num);
            dfs(nums, set, n + 1, temp);
            set.remove(num);
            temp.remove(temp.size() - 1);
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了85.18% 的Java用户
 * 内存消耗:41.9 MB,击败了14.42% 的Java用户
 */