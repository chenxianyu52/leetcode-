class Solution {
    public int minMoves(int[] nums) {
        int len = nums.length;
        if (len <= 1) {
            return 0;
        }
        int result = 0;
        Arrays.sort(nums);
        while (nums[len - 1] != nums[0]) {
            int tmp = (nums[len - 1] - nums[0]);
            int max = nums[0];
            int maxI = 0;
            for (int i = 0; i < len - 1; i++) {
                nums[i] += tmp;
                if (nums[i] > max) {
                    max = nums[i];
                    maxI = i;
                }
            }
            if (max > nums[len - 1]) {
                int tt = nums[len - 1];
                nums[len - 1] = max;
                nums[maxI] = tt;
            }
            result += tmp;
        }
        return result;
    }
}
/**
 * 解答成功:
 * 				执行耗时:2239 ms,击败了5.73% 的Java用户
 * 				内存消耗:38.7 MB,击败了94.20% 的Java用户
 */