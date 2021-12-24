class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int oneNum = 0;
        int max = oneNum;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                oneNum = 0;
            } else {
                oneNum++;
            }
            // for循环里面每次都要判断一遍，如果大就赋值
            if (oneNum > max) {
                max = oneNum;
            }
        }
        return max;
    }
}