class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            hashSet.add(nums1[i]);
        }
        for (int j = 0; j < nums2.length; j++) {
            if (hashSet.contains(nums2[j]) && !result.contains(nums2[j])) {
                result.add(nums2[j]);
            }
        }
        int[] resultInt = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultInt[i] = result.get(i);
        }
        return resultInt;
    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了29.75% 的Java用户
 * 内存消耗:41.8 MB,击败了5.07% 的Java用户
 */