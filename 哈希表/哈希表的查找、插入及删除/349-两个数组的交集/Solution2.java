class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        int[] status = new int[1001];
        for (int i = 0; i < nums1.length; i++) {
            status[nums1[i]] = 1;
        }
        int index = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (status[nums2[i]] == 1) {
                result[index++] = nums2[i];
                status[nums2[i]] = 0;
            }
        }
        return Arrays.copyOfRange(result, 0, index);
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41.2 MB,击败了94.55% 的Java用户
 */