class Solution {
    public int findLHS(int[] nums) {
        int maxResult = 0;
        int len = nums.length;
        Arrays.sort(nums);
        if (nums[len - 1] - nums[0] == 1) {
            return len;
        }
        if (nums[len - 1] - nums[0] == 0) {
            return 0;
        }
        int current = Integer.MAX_VALUE;
        int currentNum = 0;
        int iSum = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != current) {
                if (iSum != 0) {
                    maxResult = Math.max(maxResult, iSum + currentNum);
                }
                if (current + 1 == nums[i]) {
                    iSum = currentNum;
                } else {
                    iSum = 0;
                }
                current = nums[i];
                currentNum = 1;
            } else {
                currentNum++;
            }
        }
        if (iSum != 0) {
            maxResult = Math.max(maxResult, iSum + currentNum);
        }
        return maxResult;
    }
}
/**
 * 解答成功:
 * 执行耗时:13 ms,击败了98.19% 的Java用户
 * 内存消耗:41.9 MB,击败了80.50% 的Java用户
 */