class Solution {
    int result = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        result = 1;
        dfs(root);
        return result - 1;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        result = Math.max(result, left + right + 1);
        return Math.max(left, right) + 1;
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41.2 MB,击败了51.77% 的Java用户
 */