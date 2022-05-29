class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int[] status = new int[1001];
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            status[nums1[i]] = 1;
        }
        for (int j = 0; j < nums2.length; j++) {
            if (status[nums2[j]] > 0) {
                result[index++] = nums2[j];
                status[nums2[j]] = 0;
            }
        }
        return Arrays.copyOfRange(result, 0, index);
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41.2 MB,击败了82.31% 的Java用户
 */