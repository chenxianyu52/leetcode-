class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int sum = map.getOrDefault(nums1[i] + nums2[j], 0);
                map.put(nums1[i] + nums2[j], sum + 1);
            }
        }

        int result = 0;

        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                if (map.containsKey(-(nums3[i] + nums4[j]))) {
                    result += map.get(-(nums3[i] + nums4[j]));
                }
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:165 ms,击败了11.91% 的Java用户
 * 内存消耗:41.5 MB,击败了59.96% 的Java用户
 */