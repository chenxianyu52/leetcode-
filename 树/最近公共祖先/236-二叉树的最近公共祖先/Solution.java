class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root.val == p.val || root.val == q.val) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        return left != null ? left : right;

    }
}
/**
 * 解答成功:
 * 执行耗时:6 ms,击败了99.97% 的Java用户
 * 内存消耗:42.7 MB,击败了57.45% 的Java用户
 */