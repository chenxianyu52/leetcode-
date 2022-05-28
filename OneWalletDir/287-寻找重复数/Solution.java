class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            } else {
                set.add(nums[i]);
            }
        }
        return -1;
    }
}
/**
 * 解答成功:
 * 执行耗时:19 ms,击败了40.08% 的Java用户
 * 内存消耗:58 MB,击败了94.17% 的Java用户
 */