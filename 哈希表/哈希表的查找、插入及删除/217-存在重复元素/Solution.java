class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}
/**
 * 解答成功:
 * 执行耗时:7 ms,击败了74.36% 的Java用户
 * 内存消耗:53.6 MB,击败了48.75% 的Java用户
 */