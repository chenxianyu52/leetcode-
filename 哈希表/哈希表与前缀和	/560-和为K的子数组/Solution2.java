class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int pre = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            if (map.containsKey(pre - k)) {
                result += map.get(pre - k);
            }
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:23 ms,击败了64.21% 的Java用户
 * 内存消耗:45.7 MB,击败了37.58% 的Java用户
 */