class Solution {
    public int firstMissingPositive(int[] nums) {
        //[3,4,-1,1]
        int len = nums.length;
        int i = 0;
        int temp = nums[0];
        while (i < len) {
            if (temp > 0 && temp <= len && temp != nums[temp - 1]) {
                if (temp > 0 && temp <= len) {
                    int tmp = nums[temp - 1];
                    nums[temp - 1] = temp;
                    temp = tmp;
                } else {
                    // 为了防止无限循环下去
                    temp = nums[temp - 1];
                }
            } else {
                i++;
                if (i < len) {
                    temp = nums[i];
                }
            }
        }
        for (int j = 0; j < len; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }
        return len + 1;
    }
}
/**
 * 解答成功:
 * 				执行耗时:2 ms,击败了95.19% 的Java用户
 * 				内存消耗:94.8 MB,击败了27.59% 的Java用户
 */