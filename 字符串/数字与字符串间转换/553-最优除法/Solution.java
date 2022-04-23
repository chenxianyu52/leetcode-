class Solution {
    public String optimalDivision(int[] nums) {
        int len = nums.length;
        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]);
        if (len == 2) {
            sb.append("/");
            sb.append(nums[1]);
            return sb.toString();
        } else if (len > 2) {
            sb.append("/(");
            sb.append(nums[1]);
            for (int i = 2; i < len; i++) {
                sb.append("/");
                sb.append(nums[i]);
            }
            sb.append(")");
        }
        return sb.toString();
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:38.8 MB,击败了89.30% 的Java用户
 */