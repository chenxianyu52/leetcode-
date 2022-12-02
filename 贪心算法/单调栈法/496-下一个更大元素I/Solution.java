class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] status = new int[10001];
        int[] result = new int[nums1.length];
        int len1 = nums1.length;
        int len = nums2.length;
        status[nums2[len - 1]] = -1;
        for (int i = len - 2; i >= 0; i--) {
            status[nums2[i]] = nums2[i + 1];
        }
        for (int i = 0; i < len1; i++) {
            int start = nums1[i];
            int startStatus = status[start];
            while (startStatus != -1 && startStatus <= start) {
                startStatus = status[startStatus];
            }
            result[i] = startStatus;
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41.4 MB,击败了65.40% 的Java用户
 */