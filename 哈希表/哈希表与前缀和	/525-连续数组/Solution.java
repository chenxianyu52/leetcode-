class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        int count = 0;
        map.put(count, -1);
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count--;
            } else {
                count++;
            }
            if (map.containsKey(count)) {
                int pre = map.get(count);
                result = Math.max(result, i - pre);
            } else {
                map.put(count, i);
            }
        }
        return result;

    }
}
/**
 * 解答成功:
 * 执行耗时:22 ms,击败了77.91% 的Java用户
 * 内存消耗:50.4 MB,击败了40.50% 的Java用户
 */