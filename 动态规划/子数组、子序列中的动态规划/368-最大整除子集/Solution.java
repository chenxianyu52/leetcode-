class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;

        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        int maxSize = 1;
        int maxValue = 0;
        int maxIndex = 0;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if (dp[i] > maxSize) {
                maxSize = dp[i];
                maxValue = nums[i];
                maxIndex = i;
            }
        }
        List<Integer> result = new ArrayList<>();
        if (maxSize == 1) {
            result.add(nums[0]);
            return result;
        }

        for (int i = maxIndex; i >= 0; i--) {
            if (nums[maxIndex] % nums[i] == 0 && maxSize == dp[i]) {
                result.add(nums[i]);
                maxSize--;
                maxIndex = i;
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:12 ms,击败了99.00% 的Java用户
 * 内存消耗:40.7 MB,击败了97.80% 的Java用户
 */