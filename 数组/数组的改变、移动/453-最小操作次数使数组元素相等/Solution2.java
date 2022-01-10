class Solution {
    public int minMoves(int[] nums) {
        // 1,2,3,4
        /**
         * ans = ((min + ans) * n -sum)/(n-1)
         * ans = sum - min * n
         */
        int len = nums.length;
        int sum = 0;
        int min = nums[0];
        for (int i = 0; i < len; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
            sum += nums[i];
        }
        return sum - min * len;
    }
}
/**
 * 解答成功:
 * 				执行耗时:1 ms,击败了100.00% 的Java用户
 * 				内存消耗:38.1 MB,击败了99.89% 的Java用户
 */