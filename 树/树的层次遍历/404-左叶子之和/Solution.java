class Solution {
    int result = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root, false);
        return result;
    }

    private void dfs(TreeNode root, boolean isLeft) {
        if (root == null) {
            return;
        }
        if (isLeft && root.left == null && root.right == null) {
            result += root.val;
        }
        dfs(root.left, true);
        dfs(root.right, false);
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:39.6 MB,击败了24.37% 的Java用户
 */