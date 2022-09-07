class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxResult = 0;
        for (int i = 0; i < nums.length; i++) {
            int a = map.getOrDefault(nums[i], 0);
            map.put(nums[i], a + 1);
            if (map.containsKey(nums[i] - 1)) {
                int max = map.get(nums[i] - 1) + map.get(nums[i]);
                maxResult = Math.max(max, maxResult);
            }
            if (map.containsKey(nums[i] + 1)) {
                int max = map.get(nums[i] + 1) + map.get(nums[i]);
                maxResult = Math.max(max, maxResult);
            }
        }
        return maxResult;
    }
}
/**
 * 解答成功:
 * 执行耗时:27 ms,击败了12.73% 的Java用户
 * 内存消耗:42.2 MB,击败了58.92% 的Java用户
 */