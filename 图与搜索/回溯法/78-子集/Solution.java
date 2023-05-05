class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0, new ArrayList<>());
        return result;
    }

    private void dfs(int[] nums, int start, List<Integer> temp) {
        List<Integer> list = new ArrayList<>(temp);
        result.add(list);

        for (int i = start; i < nums.length; i++) {
            int num = nums[i];
            temp.add(num);
            dfs(nums, i + 1, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:40.9 MB,击败了98.38% 的Java用户
 */