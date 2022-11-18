class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                temp = nums[i];
            }
            count += (nums[i] == temp) ? 1 : -1;
        }
        return temp;
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了99.99% 的Java用户
 * 内存消耗:44.7 MB,击败了88.34% 的Java用户
 */