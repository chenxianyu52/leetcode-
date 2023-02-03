class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return process(nums, 0, nums.length - 1);
    }

    private TreeNode process(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int temp = start;
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] > nums[temp]) {
                temp = i;
            }
        }
        TreeNode root = new TreeNode(nums[temp]);
        root.left = process(nums, start, temp - 1);
        root.right = process(nums, temp + 1, end);
        return root;
    }
}
/**
 * 解答成功:
 * 执行耗时:2 ms,击败了80.54% 的Java用户
 * 内存消耗:41.2 MB,击败了96.50% 的Java用户
 */