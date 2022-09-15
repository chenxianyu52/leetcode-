class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length < 2) {
            return false;
        }
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int temp = 0;
        for (int i = 0; i < len; i++) {
            temp = (temp + nums[i]) % k;
            if (map.containsKey(temp)) {
                int preIndex = map.get(temp);
                if (i - preIndex >= 2) {
                    return true;
                }

            } else {
                map.put(temp, i);
            }
        }

        return false;

    }
}
/**
 * 解答成功:
 * 执行耗时:18 ms,击败了44.97% 的Java用户
 * 内存消耗:58.7 MB,击败了19.49% 的Java用户
 */