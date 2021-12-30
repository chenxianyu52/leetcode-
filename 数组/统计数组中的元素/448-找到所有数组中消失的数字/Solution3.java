class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            nums[(nums[i] - 1) % len] += len;
        }
        for (int j = 0; j < len; j++) {
            if (nums[j] <= len) {
                list.add(j + 1);
            }
        }
        return list;
    }
}
/**
 * 解答成功:
 * 				执行耗时:3 ms,击败了100.00% 的Java用户
 * 				内存消耗:47.8 MB,击败了6.40% 的Java用户
 */