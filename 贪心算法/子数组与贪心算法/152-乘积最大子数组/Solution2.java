class Solution {
    public int maxProduct(int[] nums) {
        int preMax = nums[0];
        int preMin = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
//            System.out.println("i: " + i + " , preMax : " + preMax + " , preMin: " + preMin + " , max : " + max);
            int currentChengMax = preMax * nums[i];
            int currentChengMin = preMin * nums[i];
            int currentMax = Math.max(currentChengMax, Math.max(nums[i], currentChengMin));
            ;
            max = Math.max(max, currentMax);

            preMax = currentMax;
            preMin = Math.min(currentChengMax, Math.min(nums[i], currentChengMin));
        }
        return max;
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了66.34% 的Java用户
 * 内存消耗:41.2 MB,击败了96.01% 的Java用户
 */