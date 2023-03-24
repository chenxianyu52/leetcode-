class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftDepth = dfs(root.left);
        int rightDepth = dfs(root.right);
        if (Math.abs(leftDepth - rightDepth) > 1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(dfs(root.left), dfs(root.right));
    }
}
/**
 * 解答成功:
 * 执行耗时:1 ms,击败了45.47% 的Java用户
 * 内存消耗:41 MB,击败了71.01% 的Java用户
 */