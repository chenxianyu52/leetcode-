class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) {
                return num;
            }
        }

        return Math.min(nums1[0], nums2[0]) * 10 + Math.max(nums1[0], nums2[0]);
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了65.22% 的Java用户
 * 内存消耗:39.5 MB,击败了34.78% 的Java用户
 */