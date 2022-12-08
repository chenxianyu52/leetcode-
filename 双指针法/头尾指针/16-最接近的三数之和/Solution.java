class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        int resultCha = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < len - 2; i++) {
            int nums1 = nums[i];
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = len - 1;
            while (left < right) {
                int nums2 = nums[left];
                int nums3 = nums[right];
                if (nums1 + nums2 + nums3 == target) {
                    return target;
                }
                if (nums1 + nums2 + nums3 > target) {
                    right--;
                } else {
                    left++;
                }
                int cha = Math.abs(target - nums1 - nums2 - nums3);
                if (cha < resultCha) {
                    result = nums1 + nums2 + nums3;
                    resultCha = cha;
                }
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:11 ms,击败了93.33% 的Java用户
 * 内存消耗:41.2 MB,击败了68.73% 的Java用户
 */