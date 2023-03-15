class Solution {
    int pre = 0;

    public TreeNode convertBST(TreeNode root) {
        dfs(root);
        return root;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.right);
        pre = pre + root.val;
        root.val = pre;
        dfs(root.left);
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41.5 MB,击败了57.12% 的Java用户
 */