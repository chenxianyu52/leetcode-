class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(nums, 0, new ArrayList<>());
        return result;
    }

    private void dfs(int[] nums, int start, List<Integer> temp) {
        result.add(new ArrayList<>(temp));
        Set<Integer> set = new HashSet<>();
        for (int i = start; i < nums.length; i++) {
            int num = nums[i];
            if (!set.contains(num)) {
                temp.add(num);
                set.add(num);
                dfs(nums, i + 1, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了99.15% 的Java用户
 * 内存消耗:42.8 MB,击败了5.00% 的Java用户
 */