class Solution {
    TreeNode result;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        result = root;
        dfs(root, p, q);
        return result;
    }

    private void dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return;
        }
        if (root.val > p.val && root.val > q.val) {
            dfs(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val) {
            dfs(root.right, p, q);
        } else {
            result = root;
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:6 ms,击败了38.24% 的Java用户
 * 内存消耗:42.3 MB,击败了44.22% 的Java用户
 */