class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i]) && !list.contains(nums2[i])) {
                list.add(nums2[i]);
            }
        }
        int len = list.size();
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            result[i] = list.get(i).intValue();
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了37.57% 的Java用户
 * 内存消耗:41.3 MB,击败了77.82% 的Java用户
 */