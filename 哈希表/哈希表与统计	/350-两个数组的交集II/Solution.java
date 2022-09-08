class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int[] status = new int[1001];
        for (int i = 0; i < nums1.length; i++) {
            status[nums1[i]]++;
        }
        for (int i = 0; i < nums2.length; i++) {
            if (status[nums2[i]] > 0) {
                status[nums2[i]]--;
                list.add(nums2[i]);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了98.93% 的Java用户
 * 内存消耗:41.7 MB,击败了33.23% 的Java用户
 */