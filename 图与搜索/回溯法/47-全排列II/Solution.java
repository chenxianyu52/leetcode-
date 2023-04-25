class Solution {
    List<List<Integer>> result = new ArrayList<>();
    boolean[] status;

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        status = new boolean[nums.length];
        Set<Integer> set = new HashSet<>();
        dfs(nums, status, 0, new ArrayList<>(), set);
        return result;
    }

    private void dfs(int[] nums, boolean[] status, int start, List<Integer> temp, Set<Integer> set) {
        if (start == nums.length) {
            List<Integer> list = new ArrayList<>(temp);
            result.add(list);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (set.contains(i)) {
                continue;
            }
            if (i > 0 && num == nums[i - 1] && !status[i - 1]) {
                continue;
            }
            set.add(i);
            temp.add(num);
            status[i] = true;
            dfs(nums, status, start + 1, temp, set);
            temp.remove(temp.size() - 1);
            status[i] = false;
            set.remove(i);
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了44.66% 的Java用户
 * 内存消耗:42.5 MB,击败了6.68% 的Java用户
 */