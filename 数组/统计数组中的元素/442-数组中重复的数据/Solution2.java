class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int len = nums.length;
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            nums[(num - 1) % len] += len;
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] > 2 * len) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
/**
 * 解答成功:
 * 					执行耗时:3 ms,击败了100.00% 的Java用户
 * 					内存消耗:47.6 MB,击败了17.46% 的Java用户
 */