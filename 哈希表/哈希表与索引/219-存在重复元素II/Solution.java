class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int start = 0; // [start,end] 窗口
        int end = -1;
        while (start < nums.length) {
            if (end - start < k && (end + 1) < nums.length) {
                end++;
                if (set.contains(nums[end])) {
                    return true;
                } else {
                    set.add(nums[end]);
                }
            } else {
                set.remove(nums[start]);
                start++;
            }
        }
        return false;
    }
}
/**
 * 解答成功:
 * 执行耗时:17 ms,击败了84.70% 的Java用户
 * 内存消耗:54.1 MB,击败了5.02% 的Java用户
 */