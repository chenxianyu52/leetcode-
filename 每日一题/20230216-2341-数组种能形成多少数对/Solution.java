class Solution {
    public int[] numberOfPairs(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        int size = set.size();
        return new int[]{(nums.length - size) / 2, size};

    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了54.00% 的Java用户
 * 内存消耗:39.9 MB,击败了91.20% 的Java用户
 */