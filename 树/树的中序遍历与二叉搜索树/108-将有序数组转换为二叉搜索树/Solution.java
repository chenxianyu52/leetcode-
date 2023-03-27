class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private TreeNode dfs(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (right + left) / 2;
        TreeNode parent = new TreeNode(nums[mid]);
        parent.left = dfs(nums, left, mid - 1);
        parent.right = dfs(nums, mid + 1, right);
        return parent;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41.6 MB,击败了17.06% 的Java用户
 */