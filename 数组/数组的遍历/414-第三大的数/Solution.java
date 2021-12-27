class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if (set.size() >= 3) {
            set.pollLast();
            set.pollLast();
            return set.pollLast();
        } else {
            return set.last();
        }
    }
}
/**
 * 解答成功:
 * 				执行耗时:5 ms,击败了24.96% 的Java用户
 * 				内存消耗:38 MB,击败了90.00% 的Java用户
 */