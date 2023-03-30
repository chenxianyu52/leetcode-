class Solution {
    public void flatten(TreeNode root) {
        dfs(root);
    }

    private TreeNode dfs(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode tempLeft = dfs(root.left);
        TreeNode tempRight = dfs(root.right);
        if (tempLeft != null) {
            root.right = tempLeft;
            root.left = null;
            TreeNode temp = tempLeft;
            while (temp.right != null) {
                temp = temp.right;
            }
            temp.right = tempRight;
        }
        return root;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41.2 MB,击败了28.27% 的Java用户
 */