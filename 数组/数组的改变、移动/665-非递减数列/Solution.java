class Solution {
    public boolean checkPossibility(int[] nums) {
        int changNum = 0;
        int len = nums.length;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (i == 0) {
                    nums[i] = nums[i + 1];
                } else {
                    if (nums[i - 1] <= nums[i + 1]) {
                        nums[i] = nums[i - 1];
                    } else {
                        nums[i + 1] = nums[i];
                    }
                }
                changNum++;
                if (changNum > 1) {
                    break;
                }
            }
        }
        if (changNum <= 1) {
            return true;
        } else {
            return false;
        }
    }
}
/**
 * 解答成功:
 * 				执行耗时:0 ms,击败了100.00% 的Java用户
 * 				内存消耗:39.2 MB,击败了96.40% 的Java用户
 */