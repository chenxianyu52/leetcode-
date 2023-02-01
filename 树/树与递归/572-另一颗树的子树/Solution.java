class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return dfs(root, subRoot);
    }

    private boolean dfs(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }
        return check(s, t) || dfs(s.left, t) || dfs(s.right, t);


    }

    private boolean check(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null || s.val != t.val) {
            return false;
        }
        return check(s.left, t.left) && check(s.right, t.right);
    }
}
/**
 * 解答成功:
 * 执行耗时:3 ms,击败了70.26% 的Java用户
 * 内存消耗:41.3 MB,击败了77.80% 的Java用户
 */