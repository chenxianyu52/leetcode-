class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        if (nums.length == 1) {
            result.add(String.valueOf(nums[0]));
            return result;
        }
        int preI = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] != 1) {
                if (i - 1 == preI) {
                    result.add(String.valueOf(nums[preI]));
                } else {
                    result.add(String.valueOf(nums[preI]) + "->" + String.valueOf(nums[i - 1]));
                }
                preI = i;
            }
            if (i == nums.length - 1) {
                if (nums.length - 1 == preI) {
                    result.add(String.valueOf(nums[preI]));
                } else {
                    result.add(String.valueOf(nums[preI]) + "->" + String.valueOf(nums[nums.length - 1]));
                }
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:6 ms,击败了45.87% 的Java用户
 * 内存消耗:39.9 MB,击败了20.76% 的Java用户
 */
