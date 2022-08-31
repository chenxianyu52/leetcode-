class Solution {
    public int findPairs(int[] nums, int k) {
        int result = 0;
        Arrays.sort(nums);
        boolean isMatch = false;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                isMatch = false;
                if (set.contains(nums[i] + k) || set.contains(nums[i] - k)) {
                    result++;
                }
                set.add(nums[i]);
            } else {
                if (k == 0) {
                    if (!isMatch) {
                        isMatch = true;
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:10 ms,击败了40.05% 的Java用户
 * 内存消耗:41.9 MB,击败了38.20% 的Java用户
 */