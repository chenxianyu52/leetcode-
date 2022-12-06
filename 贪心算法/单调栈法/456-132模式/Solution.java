class Solution {
    public boolean find132pattern(int[] nums) {
        int len = nums.length;
        if (len < 3) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int k = Integer.MIN_VALUE;
        for (int i = len - 1; i >= 0; i--) {
            if (nums[i] < k) {
                return true;
            }
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                k = Math.max(stack.pop(), k);
            }
            stack.push(nums[i]);
        }
        return false;
    }
}
/**
 * 解答成功:
 * 执行耗时:40 ms,击败了39.62% 的Java用户
 * 内存消耗:60.2 MB,击败了53.38% 的Java用户
 */