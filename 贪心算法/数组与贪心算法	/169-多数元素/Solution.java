class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int sum = map.getOrDefault(nums[i], 0) + 1;
            if (sum > len / 2) {
                return nums[i];
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return 0;
    }
}
/**
 * 解答成功:
 * 执行耗时:16 ms,击败了8.29% 的Java用户
 * 内存消耗:46.6 MB,击败了14.70% 的Java用户
 */