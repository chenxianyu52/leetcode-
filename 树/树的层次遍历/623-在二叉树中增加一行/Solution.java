class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        TreeNode tommyHead = new TreeNode();
        tommyHead.left = root;
        dfs(tommyHead, 0, depth, val);
        return tommyHead.left;
    }

    private void dfs(TreeNode root, int currentDepth, int depth, int val) {
        if (root == null) {
            return;
        }
        if (currentDepth == depth - 1) {
            TreeNode left = root.left;
            TreeNode right = root.right;
            TreeNode newLeft = new TreeNode(val);
            TreeNode newRight = new TreeNode(val);
            newLeft.left = left;
            newRight.right = right;
            root.left = newLeft;
            root.right = newRight;
        } else {
            dfs(root.left, currentDepth + 1, depth, val);
            dfs(root.right, currentDepth + 1, depth, val);
        }
    }
}
/**
 * 解答成功:
 * 执行耗时:0 ms,击败了100.00% 的Java用户
 * 内存消耗:41 MB,击败了77.39% 的Java用户
 */