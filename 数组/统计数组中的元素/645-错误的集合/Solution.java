class Solution {
    public int[] findErrorNums(int[] nums) {
        int len = nums.length;
        int[] status = new int[len + 1];
        int[] result = new int[2];
        for (int i = 0; i < len; i++) {
            status[nums[i]]++;
        }
        for (int i = 1; i < len + 1; i++) {
            if (status[i] == 2) {
                result[0] = i;
            } else if (status[i] == 0) {
                result[1] = i;
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 				执行耗时:1 ms,击败了100.00% 的Java用户
 * 				内存消耗:40.2 MB,击败了34.10% 的Java用户
 */