import java.util.Arrays;
import java.util.Collections;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}

/**
 * 解答成功:
 * 执行耗时:1 ms,击败了64.68% 的Java用户
 * 内存消耗:40.7 MB,击败了73.98% 的Java用户
 */