class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] status1 = new int[101];
        int[] status2 = new int[101];
        List<Integer> result = new ArrayList<>();
        for (int num : nums1) {
            status1[num] = 1;
        }
        for (int num : nums2) {
            status2[num] = 1;
        }

        for (int i = 1; i <= 100; i++) {
            if (status1[i] == 1 && status2[i] == 1) {
                result.add(i);
                status1[i] = 0;
                status2[i] = 0;
            }
        }

        for (int num : nums3) {
            if (status1[num] == 1) {
                result.add(num);
                status1[num] = 0;
                continue;
            }
            if (status2[num] == 1) {
                result.add(num);
                status2[num] = 0;
                continue;
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了100.00% 的Java用户
 * 内存消耗:42 MB,击败了75.92% 的Java用户
 */