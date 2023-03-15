class Solution {
    Integer pre = null;

    public boolean isValidBST(TreeNode root) {
        return dfs(root);
    }

    private boolean dfs(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean left = dfs(root.left);
        boolean mid = true;
        if (pre == null) {
            pre = root.val;
        } else {
            if (pre >= root.val) {
                mid = false;
            } else {
                pre = root.val;
            }
        }
        boolean right = dfs(root.right);
        return left && mid && right;

    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41.1 MB,击败了39.13% 的Java用户
 */