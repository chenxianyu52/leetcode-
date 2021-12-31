class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int len = nums.length;
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            nums[(num - 1) % len] += len;
        }
        for (int i = 0; i < len; i++) {
            if ((nums[i] % len) != 0) {
                if (nums[i] / len == 2) {
                    result.add(i + 1);
                }
            } else {
                if (nums[i] / len == 3) {
                    result.add(i + 1);
                }
            }
        }
        return result;
    }
}

/**
 * 解答成功:
 * 					执行耗时:4 ms,击败了81.40% 的Java用户
 * 					内存消耗:47.6 MB,击败了17.05% 的Java用户
 */