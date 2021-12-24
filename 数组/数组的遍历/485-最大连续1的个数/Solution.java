class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int tempResult = result;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result = result > tempResult ? result : tempResult;
                tempResult = 0;
            } else {
                tempResult++;
            }
        }
        result = result > tempResult ? result : tempResult;
        return result;
    }
}
/**
 * 解答成功:
 * 				执行耗时:1 ms,击败了100.00% 的Java用户
 * 				内存消耗:39.8 MB,击败了45.68% 的Java用户
 */