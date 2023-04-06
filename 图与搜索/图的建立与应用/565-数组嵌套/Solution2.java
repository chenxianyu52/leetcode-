class Solution {
    public int arrayNesting(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int current = i;
            int sum = 0;
            while (nums[current] != -1) {
                int temp = nums[current];
                nums[current] = -1;
                current = temp;
                sum++;
            }
            result = Math.max(result, sum);
        }
        return result;
    }
}
/**
 * 解答成功:
 * 执行耗时:4 ms,击败了93.52% 的Java用户
 * 内存消耗:57.3 MB,击败了25.38% 的Java用户
 */